package application;

//Caleb Miller
	//20170730
		//This is my own productpackage application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();

		// create board
		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 6; y++) {
				if (x % 2 == 0 || x == 0) {
					pane.getChildren().add(createSquare(Color.BLACK));
					pane.getChildren().add(createSquare(Color.WHITE));
				} else {
					pane.getChildren().add(createSquare(Color.WHITE));
					pane.getChildren().add(createSquare(Color.BLACK));
				}
			}
		}

		Scene scene = new Scene(pane, 312, 286);
		primaryStage.setResizable(true);
		primaryStage.setTitle("CheckerBoard");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Rectangle createSquare(Color c) {
		Rectangle r = new Rectangle(25, 25, 25, 25);
		r.setStroke(c);
		r.setFill(c);
		return r;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
