package application.screentests;

import application.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MenuScreenTest extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/menu.fxml"));
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
