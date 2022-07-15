package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import core.cell.Cell;
import core.cell.EukaryoticCell;
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
    void backBtnPressed(ActionEvent event) throws IOException {
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

    public chooseCellController(ArrayList<Cell>cells, ArrayList<Component>components, String prevChoice) {
    	if (prevChoice.equals("Eu")){
    		for (Cell cell: cells) {
    			if (cell instanceof EukaryoticCell) {
    				Button cellName = new Button(cell.getName().toUpperCase());
    				this.buttonBox.getChildren().add(cellName);
    			}
    		}
    	}
    }
}