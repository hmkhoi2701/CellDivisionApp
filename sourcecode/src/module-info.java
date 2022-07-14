module CellApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.controller to javafx.graphics, javafx.fxml;
	opens application.screentests to javafx.graphics, javafx.xml;
}
