package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import core.cell.Cell;
import core.cell.EukaryoticCell;
import core.cell.ProkaryoticCell;
import core.component.Component;
import core.division.GrowMethod;
import core.division.ReproduceMethod;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class chooseDivisionController {
	private String prevChoice;
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    @FXML
    private VBox buttonBox;
    
    @FXML
    public void initialize() {
    	if (prevChoice.equals("Eu")){
    		Cell eu = new EukaryoticCell("");
    		GrowMethod growMethod = eu.getGrowMethod();
    		ReproduceMethod reproduceMethod = eu.getReproduceMethod();
    		cells.remove(eu);
    		buttonBox.setSpacing(70);

			Button cellMitosis = new Button("MITOSIS");
			cellMitosis.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
					+ "-fx-font-weight: Bold; -fx-background-color: #FFDAB9; -fx-background-radius: 20");
			cellMitosis.setPrefSize(350, 53);
			cellMitosis.setMaxHeight(cellMitosis.USE_PREF_SIZE);
			cellMitosis.setMaxWidth(cellMitosis.USE_PREF_SIZE);
			
			cellMitosis.setOnAction(event->{
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/MediaPlayer.fxml"));
	    		MediaPlayerController controller = new MediaPlayerController(cells,components,growMethod);
	    		loader.setController(controller);
	    		Parent root = null;
				try {
					root = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Scene scene = new Scene(root);
	            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	            stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
	            stage.setScene(scene);
	            stage.setTitle("Cell Application");
	            stage.show();
			});
			
			buttonBox.getChildren().add(cellMitosis);
			
			Button cellMeiosis = new Button("MEIOSIS");
			cellMeiosis.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
					+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
			cellMeiosis.setPrefSize(350, 53);
			cellMeiosis.setMaxHeight(cellMeiosis.USE_PREF_SIZE);
			cellMeiosis.setMaxWidth(cellMeiosis.USE_PREF_SIZE);
			
			cellMeiosis.setOnAction(event->{
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/MediaPlayer.fxml"));
	    		MediaPlayerController controller = new MediaPlayerController(cells,components,reproduceMethod);
	    		loader.setController(controller);
	    		Parent root = null;
				try {
					root = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Scene scene = new Scene(root);
	            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	            stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
	            stage.setScene(scene);
	            stage.setTitle("Cell Application");
	            stage.show();
			});
			
			buttonBox.getChildren().add(cellMeiosis);
    	}
    	if (prevChoice.equals("Pro")) {
    		Cell pro = new ProkaryoticCell("");
    		GrowMethod growMethod = pro.getGrowMethod();
    		ReproduceMethod reproduceMethod = pro.getReproduceMethod();
    		cells.remove(pro);
    		buttonBox.setSpacing(100);
    		Button cellAmitosis = new Button("AMITOSIS");
			cellAmitosis.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
					+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
			cellAmitosis.setPrefSize(350, 53);
			cellAmitosis.setMaxHeight(cellAmitosis.USE_PREF_SIZE);
			cellAmitosis.setMaxWidth(cellAmitosis.USE_PREF_SIZE);
			
			cellAmitosis.setOnAction(event->{
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/MediaPlayer.fxml"));
	    		MediaPlayerController controller = new MediaPlayerController(cells,components,reproduceMethod);
	    		loader.setController(controller);
	    		Parent root = null;
				try {
					root = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Scene scene = new Scene(root);
	            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	            stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
	            stage.setScene(scene);
	            stage.setTitle("Cell Application");
	            stage.show();
			});
			
			buttonBox.getChildren().add(cellAmitosis);
    	}    	
    	Button backBtn = new Button("BACK");
    	backBtn.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
				+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
    	backBtn.setPrefSize(350, 53);
    	backBtn.setMaxHeight(backBtn.USE_PREF_SIZE);
    	backBtn.setMaxWidth(backBtn.USE_PREF_SIZE);
    	backBtn.setOnAction(event -> {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellTypeMenu.fxml"));
    		chooseCellTypeController controller = new chooseCellTypeController(cells,components,"Div");
    		loader.setController(controller);
    		Parent root = null;
			try {
				root = loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
            stage.setScene(scene);
            stage.setTitle("Cell Application");
            stage.show();
    	});
    	buttonBox.getChildren().add(backBtn);
    }
    
    public chooseDivisionController(ArrayList<Cell>cells, ArrayList<Component>components, String prevChoice) {
    	this.cells = cells;
    	this.components = components;
    	this.prevChoice = prevChoice;
    }
}