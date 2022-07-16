package application.controller;

import application.Main;
import application.controller.component.AnimalController;
import application.controller.component.ArchaeaController;
import application.controller.component.BacteriaController;
import application.controller.component.FungiController;
import application.controller.component.PlantController;
import application.controller.component.ProtistController;
import core.cell.Cell;
import core.component.Component;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class albumController {
	private ArrayList<Cell>cells;
	private ArrayList<Component>components;
	private String imgDir;
	private String name;
	
    private String s ;
    private int k = 0 ;
    private int max = 4;
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
        nextImgBtn.setVisible(true);

        k -= 1 ;
        if (k <= 0) {
            k = 0;
            prevImgBtn.setVisible(false);
        }
        Image myimage = new Image(getClass().getResourceAsStream(imgDir+"/"+String.valueOf(k)+".png"),600, 500, false, false);
        myImageView.setImage(myimage);


    }
    @FXML
    void SelectCell(ActionEvent event) {
        s = ListOfCell.getSelectionModel().getSelectedItem().toString();
        if (s =="Album View") {
	        k = 0;
	        prevImgBtn.setVisible(false);
	        nextImgBtn.setVisible(true);
	        Image myimage = new Image(getClass().getResourceAsStream(imgDir+ "/" + String.valueOf(k) + ".png"), 600, 500, false, false);
	        myImageView.setImage(myimage);
        }
        
        else {
            try {
                final String FXML_FILE_PATH = "/application/view/"+name+".fxml";
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));
                if (name == "Animal") {
                	AnimalController ctl = new AnimalController(cells,components);
                	fxmlLoader.setController(ctl);
                }
                else if (name == "Plant"){
                	PlantController ctl = new PlantController(cells,components);
                	fxmlLoader.setController(ctl);
                }
                else if (name == "Fungi"){
                	FungiController ctl = new FungiController(cells,components);
                	fxmlLoader.setController(ctl);
                }
                else if (name == "Protist"){
                	ProtistController ctl = new ProtistController(cells,components);
                	fxmlLoader.setController(ctl);
                }
                else if (name == "Bacteria"){
                	BacteriaController ctl = new BacteriaController(cells,components);
                	fxmlLoader.setController(ctl);
                }
                else if (name == "Archaea"){
                	ArchaeaController ctl = new ArchaeaController(cells,components);
                	fxmlLoader.setController(ctl);
                }
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
        k += 1 ;
        prevImgBtn.setVisible(true);
        if (k >= max) {
            k = max;
            nextImgBtn.setVisible(false);
        }
        Image myimage = new Image(getClass().getResourceAsStream(imgDir+"/"+String.valueOf(k)+".png"),600, 500, false, false);
        myImageView.setImage(myimage);

        }
    
    public void initialize() {
        ObservableList<String>list = FXCollections.observableArrayList("Album View","Component View");
        ListOfCell.setItems(list);
        ListOfCell.getSelectionModel().select(0);
        Image myimage = new Image(getClass().getResourceAsStream(imgDir+"/"+String.valueOf(k)+".png"),600, 500, false, false);
        myImageView.setImage(myimage);
        prevImgBtn.setVisible(false);
        if (name.equals("Help")) {
        	ListOfCell.setDisable(true);
        	ListOfCell.setVisible(false);
        }
    }
    @FXML
    void backBtnClicked(ActionEvent event) throws IOException {
    	FXMLLoader loader;
    	if (name.equals("Help")) {
    		loader = new FXMLLoader(getClass().getResource("/application/view/menu.fxml"));
    		menuController controller = new menuController(cells,components);
    		loader.setController(controller);
    	}
    	else {
    		loader = new FXMLLoader(getClass().getResource("/application/view/chooseCellTypeMenu.fxml"));
    		chooseCellTypeController controller = new chooseCellTypeController(cells,components,"Comp");
    		loader.setController(controller);
    	}		
		Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
        stage.setScene(scene);
        stage.setTitle("Cell Application");
        stage.show();

    }
    public albumController(ArrayList<Cell>cells,ArrayList<Component>components,String imgDir, String name) {
    	this.cells = cells;
    	this.components = components;
    	this.imgDir = imgDir;
    	this.name = name;
    }
}
