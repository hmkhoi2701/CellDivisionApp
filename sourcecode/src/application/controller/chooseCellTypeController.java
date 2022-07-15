package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import core.cell.Cell;
import core.component.Component;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class chooseCellTypeController{
	private String prevChoice;
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    @FXML
    void backBtnPressed(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/menu.fxml"));
    	menuController controller = new menuController(cells,components);
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
    void eukaryotesBtnClicked(ActionEvent event) throws IOException {
    	if (prevChoice.equals("Comp")) {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellMenu.fxml"));
	    	chooseCellController controller = new chooseCellController(cells,components,"Eu");
	    	loader.setController(controller);
			Parent root = loader.load();
	        Scene scene = new Scene(root);
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
	        stage.setScene(scene);
	        stage.setTitle("Cell Application");
	        stage.show();
    	}
    }

    @FXML
    void prokaryotesBtnClicked(ActionEvent event) throws IOException {
    	if (prevChoice.equals("Comp")) {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellMenu.fxml"));
	    	chooseCellController controller = new chooseCellController(cells,components,"Pro");
	    	loader.setController(controller);
			Parent root = loader.load();
	        Scene scene = new Scene(root);
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
	        stage.setScene(scene);
	        stage.setTitle("Cell Application");
	        stage.show();
    	}
    }

    public chooseCellTypeController(ArrayList<Cell>cells, ArrayList<Component>components,String prevChoice) {
    	this.cells = cells;
    	this.components = components;
    	this.prevChoice = prevChoice;
    }
}