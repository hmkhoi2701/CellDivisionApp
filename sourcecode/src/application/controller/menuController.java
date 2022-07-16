package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import core.cell.Cell;
import core.component.Component;
import javafx.event.ActionEvent;

public class menuController{
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
	@FXML
	private Button cellComponentBtn;
	@FXML
	private Button cellDivisionBtn;
	@FXML
	private Button helpBtn;
	@FXML
	private Button quitBtn;

	 @FXML
    void cellCompPressed(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellTypeMenu.fxml"));
		chooseCellTypeController controller = new chooseCellTypeController(cells,components,"Comp");
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
    void cellDivPressed(ActionEvent event) throws IOException {
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
    void helpBtnPressed(ActionEvent event) {
    }

    @FXML
    void quitBtnPressed(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	Stage stage = (Stage)alert.getDialogPane().getScene().getWindow();
    	stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
    	alert.setTitle("Quit");
    	alert.setContentText("Do you want to quit?");
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		stage.close();
    	}
    }

    public menuController(ArrayList<Cell>cells, ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}
