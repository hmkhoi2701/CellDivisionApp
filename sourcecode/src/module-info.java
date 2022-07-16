module CellApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.media;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.controller to javafx.graphics, javafx.fxml;
	opens application.screentests to javafx.graphics, javafx.xml;
	opens application.controller.component to javafx.graphics, javafx.fxml;
}
