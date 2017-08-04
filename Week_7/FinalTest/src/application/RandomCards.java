package application;
//Caleb Miller
	//20170730
		//This is my own product
import java.util.ArrayList;
import java.util.stream.IntStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class RandomCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane pane= new BorderPane();
		pane.setTop(getHBox());
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Week 7 Cards"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	private HBox getHBox() {
		ArrayList<Integer> cards = new ArrayList<>();
		IntStream.range(1, 52).forEach(i -> cards.add(i));
		java.util.Collections.shuffle(cards);
		
		HBox hb = new HBox(15);
		hb.setPadding(new Insets(15,15,15,15));
		hb.setStyle("-fx-background-color: white;");
		hb.getChildren().add(AddCard(cards.get(0)));
		hb.getChildren().add(AddCard(cards.get(1)));
		hb.getChildren().add(AddCard(cards.get(2)));
		
		return hb;
	}
	
	private ImageView AddCard(int i) {
		return new ImageView(new Image("/images/" + i + ".png", 400,400,true,true));
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
