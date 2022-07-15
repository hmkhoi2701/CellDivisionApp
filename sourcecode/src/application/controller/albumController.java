package application.controller;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class albumController implements Initializable {
    public String s ;
    public int k = 0 ;
    @FXML
    private ComboBox ListOfCell;
    @FXML
    private ImageView myImageView;
    @FXML
    private ImageView prevImgBtn;

    @FXML
    private ImageView nextImgBtn;

    @FXML
    void prevImgBtnClicked(MouseEvent event) {
        String j = "/guiImages/CellImages/Prokaryotes/";
        String l = "/guiImages/CellImages/Eukaryotes/";
        nextImgBtn.setVisible(true);

        k -= 1 ;
        if (k < 0) {
            k = 0;
            prevImgBtn.setVisible(false);
        }
        if (s == "Fungi" | s == "Animals" |s =="Plants" |s =="Protist" ) {
            Image myimage = new Image(getClass().getResourceAsStream(l+s+"/"+String.valueOf(k)+".png"),500, 500, false, false);
            myImageView.setImage(myimage);
        } else {
            Image myimage = new Image(getClass().getResourceAsStream(j+s+"/"+String.valueOf(k)+".png"),500, 500, false, false);
            myImageView.setImage(myimage);
        }

    }
    @FXML
    void SelectCell(ActionEvent event) {
        s = ListOfCell.getSelectionModel().getSelectedItem().toString();
        if (s =="AlbumView") {
            String l = "/guiImages/CellImages/Eukaryotes/";
            String j = "/guiImages/CellImages/Prokaryotes/";

            if (s == "Fungi" | s == "Animals" | s == "Plants" | s == "Protist") {
                k = 0;
                prevImgBtn.setVisible(false);
                nextImgBtn.setVisible(true);

                Image myimage = new Image(getClass().getResourceAsStream(l + s + "/" + String.valueOf(k) + ".png"), 500, 500, false, false);
                myImageView.setImage(myimage);
            } else {
                k = 0;
                prevImgBtn.setVisible(false);
                nextImgBtn.setVisible(true);

                Image myimage = new Image(getClass().getResourceAsStream(j + s + "/" + String.valueOf(k) + ".png"), 500, 500, false, false);
                myImageView.setImage(myimage);
            }
        } else {
            try {
                final String CART_FXML_FILE_PATH = "/application/view/components.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    @FXML
    void nextImgBtnCliked(MouseEvent event) {
        String j = "/guiImages/CellImages/Prokaryotes/";
        String l = "/guiImages/CellImages/Eukaryotes/";
        k += 1 ;
        prevImgBtn.setVisible(true);

        if (s == "Fungi"  |s =="Protist" ) {
            if (k >= 4) {
                k = 4;
                nextImgBtn.setVisible(false);

            }
            Image myimage = new Image(getClass().getResourceAsStream(l + s + "/" + String.valueOf(k) + ".png"),500, 500, false, false);
            myImageView.setImage(myimage);
        }else  if ( s == "Animals" ) {
            if (k >= 5) {
                k = 5;
                nextImgBtn.setVisible(false);

            }
            Image myimage = new Image(getClass().getResourceAsStream(l + s + "/" + String.valueOf(k) + ".png"),500, 500, false, false);
            myImageView.setImage(myimage);
        }else if (s =="Plants"){
            if (k >= 6) {
                k = 6;
                nextImgBtn.setVisible(false);

            }
            Image myimage = new Image(getClass().getResourceAsStream(l + s + "/" + String.valueOf(k) + ".png"),500, 500, false, false);
            myImageView.setImage(myimage);
        } else {
            if (k >= 4) {
                k = 4;
                nextImgBtn.setVisible(false);
            }
            Image myimage = new Image(getClass().getResourceAsStream(j+s+"/"+String.valueOf(k)+".png"),500, 500, false, false);
            myImageView.setImage(myimage);

        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String>list = FXCollections.observableArrayList("AlbumView","ComponentView");
        ListOfCell.setItems(list);
    }
}
