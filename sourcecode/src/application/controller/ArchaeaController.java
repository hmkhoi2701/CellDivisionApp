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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ArchaeaController implements Initializable {
    @FXML
    private ImageView myImageView1;
    @FXML
    private ComboBox<String> ListOfCell;
    @FXML
    private Button back;
    @FXML
    private Label nameLabel;

    @FXML
    private Label functionLabel;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button Ribosomes;
    public String s ;
    @FXML
    private Button CellWall;

    @FXML
    private Button Flagellum;
    @FXML
    private Button PlasmaMembrane;

    @FXML
    private Button Capsule;

    @FXML
    private Button Plasmid;
    @FXML
    private Button Nucleoid;

    @FXML
    private Button Pili;

    @FXML
    private Button Mesosome;

    @FXML
    private Button Cytoplasm;
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
    void btnFlagellum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Flagellum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage1 = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Ribosome.jpg"));
        myImageView.setImage(myimage1);
    }

    @FXML
    void btnNucleoid(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Nucleoid.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCytoplasm(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Cytoplasm.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPili(ActionEvent event) {
        myImageView1.setVisible(true);

        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Pili.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMesosome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Mesosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPlasmid(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Plasmid.jpg"));
        myImageView.setImage(myimage);
    }


    @FXML
    void btnPlasmaMembrane(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/PlasmaMembrane.jpg"));
        myImageView.setImage(myimage);
    }



    @FXML
    void btnCellWall(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/CellWall.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCapsule(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Archaea/ArchaeaComponents/Capsule.jpg"));
        myImageView.setImage(myimage);
    }

}

