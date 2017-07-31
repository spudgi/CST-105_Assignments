//Caleb Miller
	//20170730
		//This is my own product
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
	@Override 
	public void start(Stage primaryStage) {
	
		Pane pane = new StackPane();
		Label label = new Label("JavaFX");
		label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		Label label1 = new Label("Coding");
		label1.setFont(Font.font("SanSerif",FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().addAll(label,label1);
		

		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
