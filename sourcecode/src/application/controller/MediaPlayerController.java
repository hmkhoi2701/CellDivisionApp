package application.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;

import application.Main;
import core.cell.Cell;
import core.component.Component;
import core.division.GrowMethod;
import core.division.ReproduceMethod;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class MediaPlayerController{
    public int k = 0 ;
    private ArrayList<Cell>cells;
	private ArrayList<Component>components;
	private ReproduceMethod reproduceMethod;
	private GrowMethod growMethod;
    private String directory;
    private MediaPlayer mediaPlayer;
    
   public MediaPlayerController(ArrayList<Cell>cells, ArrayList<Component>components, ReproduceMethod reproduceMethod) {
	   this.cells = cells;
	   this.components = components;
	   this.reproduceMethod = reproduceMethod;
	   this.directory = reproduceMethod.getDirectory();
   }
   
   public MediaPlayerController(ArrayList<Cell>cells, ArrayList<Component>components, GrowMethod growMethod) {
	   this.cells = cells;
	   this.components = components;
	   this.growMethod = growMethod;
	   this.directory = growMethod.getDirectory();
   }
    
    @FXML
    private MediaView mediaView;
    
    @FXML
    private Slider progressBar;
    
    @FXML
    private StackPane pane;

    public void initialize() {
    	if(directory != null){
            Media media = new Media(getClass().getResource(directory).toString());
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            DoubleProperty widthProp = mediaView.fitWidthProperty();
            DoubleProperty heightProp = mediaView.fitHeightProperty();
            widthProp.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
            heightProp.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
            
            mediaPlayer.currentTimeProperty().addListener(new ChangeListener<javafx.util.Duration>() {
                @Override
                public void changed(ObservableValue<? extends javafx.util.Duration> observable, javafx.util.Duration oldValue, javafx.util.Duration newValue) {
                    progressBar.setValue(newValue.toSeconds());
                }
            });
            
            progressBar.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    mediaPlayer.seek(javafx.util.Duration.seconds(progressBar.getValue()));
                }
            });
            
            progressBar.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    mediaPlayer.seek(javafx.util.Duration.seconds(progressBar.getValue()));
                }
            });
            
            mediaPlayer.setOnReady(new Runnable() {
                @Override
                public void run() {
                    javafx.util.Duration total = media.getDuration();
                    progressBar.setMax(total.toSeconds());
                }
            });
            
            mediaPlayer.play();
        }    	
    }    
    
    public void pauseVideo(ActionEvent event){
        mediaPlayer.pause();
    }
    
    public void stopVideo(ActionEvent event){
        mediaPlayer.stop();
    }
    
    public void playVideo(ActionEvent event){
        mediaPlayer.play();
        mediaPlayer.setRate(1);
    }
    @FXML
    void NextStep(ActionEvent event) {
    	double currTime = progressBar.getValue();
        if (reproduceMethod == null) {
        	for (int i = 0; i<growMethod.getKeyframes().length;i++) {
        		if (currTime<growMethod.getKeyframes()[i]) {
        			mediaPlayer.seek(javafx.util.Duration.seconds(growMethod.getKeyframes()[i]));
        			break;
        		}
        	}
        }
        else {
        	for (int i = 0; i<reproduceMethod.getKeyframes().length;i++) {
        		if (currTime<reproduceMethod.getKeyframes()[i]) {
        			mediaPlayer.seek(javafx.util.Duration.seconds(reproduceMethod.getKeyframes()[i]));
        			break;
        		}
        	}
        }
    }
    
    @FXML
    void BackStep(ActionEvent event) {
    	double currTime = progressBar.getValue();
        if (reproduceMethod == null) {
        	for (int i = 0; i<=growMethod.getKeyframes().length;i++) {
        		if (i==growMethod.getKeyframes().length) {
        			mediaPlayer.seek(javafx.util.Duration.seconds(growMethod.getKeyframes()[i-2]));
        			break;
        		}
        		if (currTime>=growMethod.getKeyframes()[i]) {}
        		else {
        			if (i<=2) {
        				mediaPlayer.seek(javafx.util.Duration.seconds(growMethod.getKeyframes()[0]));
        			}
        			else {
        				mediaPlayer.seek(javafx.util.Duration.seconds(growMethod.getKeyframes()[i-2]));
        			}
        		break;
        		}
        	}
        }
        else {
        	for (int i = 0; i<=reproduceMethod.getKeyframes().length;i++) {
        		if (i==reproduceMethod.getKeyframes().length) {
        			mediaPlayer.seek(javafx.util.Duration.seconds(reproduceMethod.getKeyframes()[i-2]));
        			break;
        		}
        		if (currTime>=reproduceMethod.getKeyframes()[i]) {}
        		else {
        			if (i<=2) {
        				mediaPlayer.seek(javafx.util.Duration.seconds(reproduceMethod.getKeyframes()[0]));
        			}
        			else {
        				mediaPlayer.seek(javafx.util.Duration.seconds(reproduceMethod.getKeyframes()[i-2]));
        			}
        		break;
        		}
        	}
        }
    }
    
    @FXML
    void backBtnClicked(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellTypeMenu.fxml"));
		chooseCellTypeController controller = new chooseCellTypeController(cells,components,"Div");
		loader.setController(controller);
		Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
        stage.setScene(scene);
        stage.setTitle("Cell Application");
        stage.show();
    }
    
    @FXML
    void replayVideo(ActionEvent event) {
    	mediaPlayer.seek(javafx.util.Duration.seconds(0));
    	mediaPlayer.play();
    }
}
