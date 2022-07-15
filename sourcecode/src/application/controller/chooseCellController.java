package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import core.cell.Cell;
import core.cell.EukaryoticCell;
import core.cell.ProkaryoticCell;
import core.component.Component;
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

public class chooseCellController {
	private String prevChoice;
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    @FXML
    private VBox buttonBox;
    
    @FXML
    public void initialize() {
    	if (prevChoice.equals("Eu")){
    		buttonBox.setSpacing(30);
    		for (Cell cell: cells) {
    			if (cell instanceof EukaryoticCell) {
    				Button cellName = new Button(cell.getName().toUpperCase());
    				cellName.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
    						+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
    				cellName.setPrefSize(350, 53);
    				cellName.setMaxHeight(cellName.USE_PREF_SIZE);
    				cellName.setMaxWidth(cellName.USE_PREF_SIZE);
    				
    				cellName.setOnAction(event->{
    					FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/album.fxml"));
    		    		albumController controller = new albumController(cells,components,cell.getImgDir(),cell.getName());
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
    				
    				buttonBox.getChildren().add(cellName);
    			}
    		}
    	}
    	if (prevChoice.equals("Pro")) {
    		buttonBox.setSpacing(70);
    		for (Cell cell: cells) {
    			if (cell instanceof ProkaryoticCell) {
    				Button cellName = new Button(cell.getName().toUpperCase());
    				cellName.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
    						+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
    				cellName.setPrefSize(350, 53);
    				cellName.setMaxHeight(cellName.USE_PREF_SIZE);
    				cellName.setMaxWidth(cellName.USE_PREF_SIZE);
    				buttonBox.getChildren().add(cellName);
    				
    				cellName.setOnAction(event->{
    					FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/album.fxml"));
    		    		albumController controller = new albumController(cells,components,cell.getImgDir(),cell.getName());
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
    			}
    		}
    	}    	
    	Button backBtn = new Button("BACK");
    	backBtn.setStyle("-fx-font-family: Lucida Bright; -fx-font-size: 18pt;"
				+ "-fx-font-weight: Bold; -fx-background-color:  #FFDAB9; -fx-background-radius: 20");
    	backBtn.setPrefSize(350, 53);
    	backBtn.setMaxHeight(backBtn.USE_PREF_SIZE);
    	backBtn.setMaxWidth(backBtn.USE_PREF_SIZE);
    	backBtn.setOnAction(event -> {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellTypeMenu.fxml"));
    		chooseCellTypeController controller = new chooseCellTypeController(cells,components,"Comp");
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
    
    public chooseCellController(ArrayList<Cell>cells, ArrayList<Component>components, String prevChoice) {
    	this.cells = cells;
    	this.components = components;
    	this.prevChoice = prevChoice;
    }
}