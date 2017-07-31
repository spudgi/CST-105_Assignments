package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public abstract class ColorFont extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	// Create a pane to hold the circle
		Pane pane = new StackPane();
		Label label = new Label("JavaFX");
		label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		Label label1 = new Label("Coding");
		label1.setFont(Font.font("SanSerif",FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().addAll(label,label1);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("FontDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
