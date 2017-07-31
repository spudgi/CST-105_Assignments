package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class RandomCards extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a list of card numbers
		ArrayList<Integer> cards = getCards();
		// Create a HBox pane
		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		// Add nodes to pane
		for (int i = 0; i < 3; i++) {
			Image image = new Image("image/1.jpg");
			pane.getChildren().add(new ImageView(image));
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_03"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/** Returns a list with numbers 1-52 stored in random order */
	private ArrayList<Integer> getCards() {
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			cards.add(i + 1);
		}
		java.util.Collections.shuffle(cards);
		return cards;
	}

}
