package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 8; i++) {
		for(j = 0; j < 8; j++) {
			Rectangle rec = new Rectangle(80 * j,80 * i,80,80);
			if(i + j % 2 == 1) {
				rec.setFill(Color.BLACK);
			}
			else {
				rec.setFill(Color.WHITE);
			}
		pane.getChildren().add(rec);
		}
		}
	Scene scene = new Scene(pane, 635, 400);
	primaryStage.setTitle("Checker Board");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
