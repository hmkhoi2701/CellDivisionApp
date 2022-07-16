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

public class ProtistController{
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
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
        if (s == "Album View"){
            try {
                final String CART_FXML_FILE_PATH = "/application/view/album.fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
                albumController controller = new albumController(cells,components,
                		"/guiImages/CellImages/Eukaryotes/Protist","Protist");
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
    private final String IMG_DIR = "/guiImages/CellImages/Eukaryotes/Protist/ProtistComponent/";
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
    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("Album View","Component View");
        ListOfCell.setItems(list);
        functionLabel.setText("");
        nameLabel.setText("");
        functionLabel.setWrapText(true);
        functionLabel.setMaxWidth(550);
    }
    @FXML
    void btnAnteriorContractileVacuole(ActionEvent event) {
        adjustTF("AnteriorContractileVacuole","Anterior Contractile Vacuole");

    }

    
    
    @FXML
    void btnCilia(ActionEvent event) {
        adjustTF("Cilia","Cilia");
    }

    @FXML
    void btnFoodVacuole(ActionEvent event) {
        adjustTF("FoodVacuole","Food Vacuole");

    }

    @FXML
    void btnMacronucleus(ActionEvent event) {
        adjustTF("Macronucleus","Macronucleus");

    }

    @FXML
    void btnMicronucleus(ActionEvent event) {
        adjustTF("FoodVacuole","Micronucleus");

    }

    @FXML
    void btnPellicle(ActionEvent event) {
        adjustTF("Pellicle","Pellicle");

    }

    @FXML
    void btnOralGroove(ActionEvent event) {
        adjustTF("OralGroove","Oral Groove");

    }

    @FXML
    void btnCytosome(ActionEvent event) {
        adjustTF("Cytosome","Cytosome");

    }

    @FXML
    void btnAnalPore(ActionEvent event) {
        adjustTF("AnalPore","Anal Pore");

    }

    @FXML
    void btnPosteriorContractileVacuole(ActionEvent event) {
        adjustTF("PosteriorContractileVacuole","Posterior Contractile Vacuole");

    }

    public ProtistController(ArrayList<Cell>cells,ArrayList<Component>components) {
    	this.cells = cells;
    	this.components = components;
    }
}
