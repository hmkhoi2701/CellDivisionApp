package application.controller.component;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import application.controller.albumController;
import application.controller.chooseCellTypeController;
import core.cell.Cell;
import core.component.Component;

public class FungiController {
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    @FXML
    private Button Nucleus;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button Lysosome;

    @FXML
    private Button Ribosomes;

    @FXML
    private Button Septum;

    @FXML
    private Button CellMembrane;

    @FXML
    private Button back;

    @FXML
    private Button Budscar;

    @FXML
    private Button Nucleolus;

    @FXML
    private Button Vacuole;

    @FXML
    private Label functionLabel;

    @FXML
    private Button Mitochondrion;

    @FXML
    private Button Golgiapparatus;

    @FXML
    private ComboBox<String> ListOfCell;

    @FXML
    private Button Vesicles;

    @FXML
    private Button Cellwall;

    @FXML
    private Button Endoplasmicreticulum;

    @FXML
    private Button Peroxisome;

    @FXML
    private Button Cytoplasm;

    @FXML
    private Label nameLabel;

    private String s ;
    @FXML
    void SelectCell(ActionEvent event) {
        s = ListOfCell.getSelectionModel().getSelectedItem().toString();
        if (s == "Album View"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                albumController controller = new albumController(cells,components,
                		"/guiImages/CellImages/Eukaryotes/Fungi","Fungi");
	    		fxmlLoader.setController(controller);
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
        }
    }
    private final String IMG_DIR = "/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/";
    void adjustTF(String imgName, String cName) {
        Image myimage = new Image(getClass().getResourceAsStream(IMG_DIR+imgName+".jpg"));
        myImageView.setImage(myimage);
        for (Component c: components) {
            if (c.getcName().equals(cName)) {
                nameLabel.setText(c.getcName());
                functionLabel.setText(c.getFunction());
                break;
            }
        }
    }
    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Album View","Component View");
        ListOfCell.setItems(list);
        functionLabel.setText("");
        nameLabel.setText("");
        functionLabel.setWrapText(true);
        functionLabel.setMaxWidth(550);
    }
    @FXML
    void backbutton(ActionEvent event) throws IOException {
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
    void btnVesicles(ActionEvent event) {
        adjustTF("Vesicles","Vesicles");

    }

    @FXML
    void btnSeptum(ActionEvent event) {
        adjustTF("Septum","Septum");

    }

    @FXML
    void btnBudscar(ActionEvent event) {
        adjustTF("Budscar","Bud Scar");

    }

    @FXML
    void btnLysosome(ActionEvent event) {
        adjustTF("Lysosome","Lysosome");

    }

    @FXML
    void btnVacuole(ActionEvent event) {
        adjustTF("Vacuole","Vacuole");

    }

    @FXML
    void btnCellwall(ActionEvent event) {
        adjustTF("CellWall","Cell Wall");

    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
        adjustTF("CellMembrane","Plasma Membrane");

    }

    @FXML
    void btnEndoplasmicreticulum(ActionEvent event) {
        adjustTF("Endoplasmicreticulum","Endoplasmic Reticulum");

    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        adjustTF("Ribosomes", "Ribosomes");

    }

    @FXML
    void btnCytoplasm(ActionEvent event) {
        adjustTF("Cytoplasm","Cytoplasm");

    }

    @FXML
    void btnMitochondrion(ActionEvent event) {
        adjustTF("Mitochondrion","Mitochondrion");

    }

    @FXML
    void btnPeroxisome(ActionEvent event) {
        adjustTF("Peroxisome","Peroxisome");

    }

    @FXML
    void btnNucleolus(ActionEvent event) {
        adjustTF("Nucleolus","Nucleolus");

    }

    @FXML
    void btnNucleusx(ActionEvent event) {
        adjustTF("Nucleus","Nucleus");

    }

    @FXML
    void btnGolgiapparatus(ActionEvent event) {
        adjustTF("GolgiApparatus","Golgi");
    }
    
    public FungiController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}