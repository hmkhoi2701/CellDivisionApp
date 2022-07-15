package application.controller;


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

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AnimalController implements Initializable {
    private String s;
    @FXML
    private Button Nucleus;

    @FXML
    private Button Mitochondria;
    @FXML
    private Button Reticulum;

    @FXML
    private Button Chromatin;

    @FXML
    private ImageView myImageView;
    @FXML
    private ImageView myImageView1;
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
    void backbutton(ActionEvent event) {

    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Ribosomes.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleus(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Nucleus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleolus(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Nucleolus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnLysosome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Lysosome.jpg"));
        myImageView.setImage(myimage);
    }
    @FXML
    void btnMitochondria(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Mitochondria.jpg"));
        myImageView.setImage(myimage);
    }
    @FXML
    void btnCytoplasm(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Cytoplasm.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMicrotubules(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image((getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Microtubules.jpg")));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPeroxisome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Peroxisome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnSmoothEndoplasmicReticulum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/SmoothEndoplasmicReticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnChromatin(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Chromatin.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/CellMembrane.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnReticulum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Reticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnRoughEndoplasmicReticulum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/RoughEndoplasmicReticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCentrosome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Centrosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnVacuole(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/Vacuole.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGolgiVesicle(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/GolgiVesicle.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGolgiApparatus(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Animals/AnimalComponent/GolgiApparatus.jpg"));
        myImageView.setImage(myimage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("AlbumView","ComponentView");
        ListOfCell.setItems(list);
    }
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
}

