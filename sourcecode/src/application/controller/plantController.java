package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class plantController implements Initializable{

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
    private ImageView myImageView1;

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
        if (s == "AlbumView"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
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

    @FXML
    void backbutton(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("AlbumView","ComponentView");
        ListOfCell.setItems(list);
    }
    @FXML
    void btnMitochondria(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Mitochondria.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnLysosome(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Lysosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGolgiApparatus(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/GolgiApparatus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnRibosomes(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Ribosomes.jpg"));
        myImageView.setImage(myimage);
    }

    
    
    
    
    @FXML
    void btnRoughEndoplasmicReticulum(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/RoughEndoplasmicReticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleolus(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Nucleolus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleus(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Nucleus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCytoplasm(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Cytoplasm.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMicrotubules(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Microtubules.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGranules(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Granules.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCellWall(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/CellWall.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/CellMembrane.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnAmyloplast(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Amyloplast.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPeroxisome(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Perixoxome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnSmoothEndoplasmicReticulum(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/SmoothEndoplasmicReticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnChloroplast(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Chloroplast.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnVacuoleMembrane(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/VacuoleMembrane.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnVacuole(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/Vacuole.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnIntermediateFilaments(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/IntermediateFilaments.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGolgiVesicless(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Plants/PlantComponent/GolgiVesicles.jpg"));
        myImageView.setImage(myimage);
    }

}
