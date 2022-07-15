package application;
	
import java.util.ArrayList;

import application.controller.menuController;
import core.cell.Cell;
import core.component.Component;
import core.initializer.Initializer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{	
		Initializer initializer = new Initializer();
		initializer.mainInitializer();
		ArrayList<Cell>cells = initializer.getCellList();
		ArrayList<Component>components = initializer.getComponentList();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/menu.fxml"));
		menuController controller = new menuController(cells,components);
		loader.setController(controller);
		Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/guiImages/5470363.png")));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cell Application");
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}