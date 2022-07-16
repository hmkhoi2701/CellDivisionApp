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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import application.controller.albumController;
import application.controller.chooseCellTypeController;
import core.cell.Cell;
import core.component.Component;

public class AnimalController {
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    private String s;
    @FXML
    private Button Nucleus;

    @FXML
    private Pane textPane;
    
    @FXML
    private Button Mitochondria;
    @FXML
    private Button Reticulum;

    @FXML
    private Button Chromatin;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button Ribosomes;

    @FXML
    private Button Lysosome;

    @FXML
    private Button SmoothEndoplasmicReticulum;

    @FXML
    private Button CellMembrane;

    @FXML
    private Button back;

    @FXML
    private Button Nucleolus;

    @FXML
    private Button Vacuole;

    @FXML
    private Label functionLabel;

    @FXML
    private ComboBox<String> ListOfCell;

    @FXML
    private Button GolgiVesicle;

    @FXML
    private Button Microtubules;

    private final String IMG_DIR = "/guiImages/CellImages/Eukaryotes/Animal/AnimalComponent/";

    @FXML
    private Button Peroxisome;

    @FXML
    private Button Golgi;

    @FXML
    private Button RoughEndoplasmicReticulum;

    @FXML
    private Button Cytoplasm;

    @FXML
    private Button Centrosome;

    @FXML
    private Label nameLabel;

    

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
    
    @FXML
    void btnRibosomes(ActionEvent event) {
        adjustTF("Ribosomes", "Ribosomes");
    }

    @FXML
    void btnNucleus(ActionEvent event) {
        adjustTF("Nucleus","Nucleus");
    }

    @FXML
    void btnNucleolus(ActionEvent event) {
        adjustTF("Nucleolus","Nucleolus");
    }

    @FXML
    void btnLysosome(ActionEvent event) {
        adjustTF("Lysosome","Lysosome");
    }
    @FXML
    void btnMitochondria(ActionEvent event) {
        adjustTF("Mitochondria","Mitochondria");
    }
    @FXML
    void btnCytoplasm(ActionEvent event) {
        adjustTF("Cytoplasm","Cytoplasm");
    }

    @FXML
    void btnMicrotubules(ActionEvent event) {
        adjustTF("Microtubules","Microtubules");
    }

    @FXML
    void btnPeroxisome(ActionEvent event) {
        adjustTF("Peroxisome","Peroxisome");
    }

    @FXML
    void btnSmoothEndoplasmicReticulum(ActionEvent event) {
        adjustTF("SmoothEndoplasmicReticulum","Endoplasmic Reticulum");
    }

    @FXML
    void btnChromatin(ActionEvent event) {
        adjustTF("Chromatin","Chromatin");
    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
        adjustTF("CellMembrane","Plasma Membrane");
    }

    @FXML
    void btnRoughEndoplasmicReticulum(ActionEvent event) {
        adjustTF("RoughEndoplasmicReticulum","Endoplasmic Reticulum");
    }

    @FXML
    void btnCentrosome(ActionEvent event) {
        adjustTF("Centrosome","Centrosome");
    }

    @FXML
    void btnVacuole(ActionEvent event) {
        adjustTF("Vacuole","Vacuole");
    }

    @FXML
    void btnGolgiVesicle(ActionEvent event) {
        adjustTF("GolgiVesicle","Golgi");
    }

    @FXML
    void btnGolgiApparatus(ActionEvent event) {
    	adjustTF("GolgiApparatus","Golgi");
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
    void SelectCell(ActionEvent event) {
        s = ListOfCell.getSelectionModel().getSelectedItem().toString();
        if (s == "Album View"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                albumController controller = new albumController(cells,components,
                		"/guiImages/CellImages/Eukaryotes/Animal","Animal");
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
    
    public AnimalController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}

