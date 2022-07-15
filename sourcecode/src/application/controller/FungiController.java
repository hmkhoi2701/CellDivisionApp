package application.controller;


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

public class FungiController {

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
    private ComboBox<?> ListOfCell;

    @FXML
    private Button Vesicles;

    @FXML
    private Button Cellwall;

    @FXML
    private Button Endoplasmicreticulum;

    @FXML
    private ImageView myImageView1;

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

    @FXML
    void btnVesicles(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Vesicles.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnSeptum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Vesicles.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnBudscar(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/BudScar.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnLysosome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Lysosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnVacuole(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Vacuole.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCellwall(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Cellwall.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCellMembrane(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/CellMembrane.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnEndoplasmicreticulum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Endoplasmicreticulum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Ribosomes.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCytoplasm(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Cytoplasm.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMitochondrion(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Mitochondrion.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPeroxisome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Peroxisome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleolus(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Nucleolus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnNucleusx(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Nucleux.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnGolgiapparatus(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Fungi/FungiComponent/Golgiapparatus.jpg"));
        myImageView.setImage(myimage);
    }

}
