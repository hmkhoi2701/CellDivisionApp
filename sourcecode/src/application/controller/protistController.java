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

public class protistController implements Initializable{

    @FXML
    private Button AnteriorContractileVacuole;

    @FXML
    private Button Cytosome;

    @FXML
    private ImageView myImageView;

    @FXML
    private Button FoodVacuole;

    @FXML
    private Button back;

    @FXML
    private Button Pellicle;

    @FXML
    private Label functionLabel;

    @FXML
    private Button OralGroove;

    @FXML
    private ComboBox<String> ListOfCell;

    @FXML
    private Button Macronucleus;

    @FXML
    private ImageView myImageView1;

    @FXML
    private Button Micronucleus;

    @FXML
    private Button AnalPore;

    @FXML
    private Button PosteriorContractileVacuole;

    @FXML
    private Label nameLabel;

    @FXML
    private Button Cilia;
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
    void btnAnteriorContractileVacuole(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/AnteriorContractileVacuole.jpg"));
        myImageView.setImage(myimage);
    }

    
    
    @FXML
    void btnCilia(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/Cilia.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnFoodVacuole(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/FoodVacuole.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMacronucleus(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/Macronucleus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMicronucleus(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/Micronucleus.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPellicle(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/Pellicle.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnOralGroove(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/OralGroove.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCytosome(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/Cytosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnAnalPore(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/AnalPore.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPosteriorContractileVacuole(ActionEvent event) {
    	myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/PosteriorContractileVacuole.jpg"));
        myImageView.setImage(myimage);
    }

}
