package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("view/menu.fxml"));
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
