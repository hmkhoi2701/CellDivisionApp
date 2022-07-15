package application.controller.component;

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
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import application.controller.albumController;
import application.controller.chooseCellTypeController;
import core.cell.Cell;
import core.component.Component;

public class BacteriaController {
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
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
        if (s == "Album View"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                albumController controller = new albumController(cells,components,
                		"/guiImages/CellImages/Prokaryotes/Bacteria","Bacteria");
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
    }
    @FXML
    void btnFlagellum(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Flagellum.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnRibosomes(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage1 = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Ribosomes.jpg"));
        myImageView.setImage(myimage1);
    }

    @FXML
    void btnNucleoid(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Nucleoid.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCytoplasm(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Cytoplasm.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPili(ActionEvent event) {
        myImageView1.setVisible(true);

        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Pili.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnMesosome(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Mesosome.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnPlasmid(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Plasmid.jpg"));
        myImageView.setImage(myimage);
    }


    @FXML
    void btnPlasmaMembrane(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/PlasmaMembrane.jpg"));
        myImageView.setImage(myimage);
    }



    @FXML
    void btnCellWall(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/CellWall.jpg"));
        myImageView.setImage(myimage);
    }

    @FXML
    void btnCapsule(ActionEvent event) {
        myImageView1.setVisible(true);
        Image myimage = new Image(getClass().getResourceAsStream("/guiImages/CellImages/Prokaryotes/Bacteria/BacteriaComponents/Capsule.jpg"));
        myImageView.setImage(myimage);
    }
    
    public BacteriaController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}
