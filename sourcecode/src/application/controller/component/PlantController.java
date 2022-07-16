package application.controller.component;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import application.controller.albumController;
import application.controller.chooseCellTypeController;
import core.cell.Cell;
import core.component.Component;
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

public class PlantController{
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
    @FXML
    private Button Nucleus;

    @FXML
    private Button GolgiApparatus;

    @FXML
    private Button CellWall;

    @FXML
    private Button Lysosome;

    @FXML
    private Button Ribosomes;

    @FXML
    private Button SmoothEndoplasmicReticulum;

    @FXML
    private Button CellMembrane;

    @FXML
    private Button Amyloplast;

    @FXML
    private Button back;

    @FXML
    private Button Nucleolus;

    @FXML
    private Button Vacuole;

    @FXML
    private ComboBox<String> ListOfCell;

    @FXML
    private Button Mitochondria;

    @FXML
    private Button VacuoleMembrane;

    @FXML
    private Button Chloroplast;

    @FXML
    private Label nameLabel;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button GolgiVesicles;

    @FXML
    private Button IntermediateFilaments;

    @FXML
    private Label functionLabel;

    @FXML
    private Button Microtubules;

    @FXML
    private Button Peroxisome;

    @FXML
    private Button Granules;

    @FXML
    private Button RoughEndoplasmicReticulum;

    @FXML
    private Button Cytoplasm;
    public String s ;

    @FXML
    void SelectCell(ActionEvent event) {
    	s = ListOfCell.getSelectionModel().getSelectedItem().toString();
        if (s == "Album View"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                albumController controller = new albumController(cells,components,
                		"/guiImages/CellImages/Eukaryotes/Plant","Plant");
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
    private final String IMG_DIR = "/guiImages/CellImages/Eukaryotes/Plant/PlantComponent/";

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
    
    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Album View","Component View");
        ListOfCell.setItems(list);
        functionLabel.setText("");
        nameLabel.setText("");
        functionLabel.setWrapText(true);
        functionLabel.setMaxWidth(550);
    }
    @FXML
    void btnMitochondria(ActionEvent event) {
        adjustTF("Mitochondria","Mitochondria");

    }

    @FXML
    void btnLysosome(ActionEvent event) {
        adjustTF("Lysosome","Lysosome");

    }

    @FXML
    void btnGolgiApparatus(ActionEvent event) {
        adjustTF("GolgiApparatus","Golgi");

    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        adjustTF("Ribosomes", "Ribosomes");

    }

    @FXML
    void btnRoughEndoplasmicReticulum(ActionEvent event) {
        adjustTF("RoughEndoplasmicReticulum", "Endoplasmic Reticulum");

    }

    @FXML
    void btnNucleolus(ActionEvent event) {
        adjustTF("Nucleolus","Nucleolus");

    }

    @FXML
    void btnNucleus(ActionEvent event) {
        adjustTF("Nucleus","Nucleus");

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
    void btnGranules(ActionEvent event) {
        adjustTF("Granules","Granules");
    }

    @FXML
    void btnCellWall(ActionEvent event) {
        adjustTF("CellWall","Cell Wall");

    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
        adjustTF("CellMembrane","Plasma Membrane");

    }

    @FXML
    void btnAmyloplast(ActionEvent event) {
        adjustTF("Amyloplast","Amyloplast");

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
    void btnChloroplast(ActionEvent event) {
        adjustTF("Cytoplasm","Cytoplasm");

    }

    @FXML
    void btnVacuoleMembrane(ActionEvent event) {
        adjustTF("VacuoleMembrane","Vacuole Membrane");
    }

    @FXML
    void btnVacuole(ActionEvent event) {
        adjustTF("Vacuole","Vacuole");

    }

    @FXML
    void btnIntermediateFilaments(ActionEvent event) {
        adjustTF("IntermediateFilaments","Intermediate Filaments");

    }

    @FXML
    void btnGolgiVesicless(ActionEvent event) {
        adjustTF("GolgiVesicles","Golgi");

    }
    
    public PlantController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}
