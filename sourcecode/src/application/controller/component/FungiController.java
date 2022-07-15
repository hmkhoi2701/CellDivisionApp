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
	private String imgDir;
	private String name;
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

    
    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Album View","Component View");
        ListOfCell.setItems(list);
        functionLabel.setText("");
        nameLabel.setText("");
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
    
    public FungiController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}
