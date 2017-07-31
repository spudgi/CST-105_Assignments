package application;
//Caleb Miller
	//20170730
		//This is my own product
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class RandomCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		ArrayList<Integer> cards = getCards();
		
		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		
		for (int i = 0; i < 3; i++) {
			Image image = new Image("image/1.jpg");
			pane.getChildren().add(new ImageView(image));
		}

		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_03"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
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
