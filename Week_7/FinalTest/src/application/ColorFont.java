//Caleb Miller
	//20170730
		//This is my own product
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public abstract class ColorFont extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(50, 25, 50, 25));
		pane.setHgap(25);

		for (int i = 0; i < 5; i++) {
			pane.getChildren().add((addText()));
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Font/Size/Color");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Text addText() {
		Text javaText = new Text(20, 20, "Gotta Love Java");
		javaText.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		javaText.setRotate(180);
		javaText.setFill(Color.color(randomNum(0, 1), randomNum(0, 1), randomNum(0, 1)));
		javaText.setOpacity(randomNum(.1, 1));
		return javaText;
	}

	public double randomNum(double low, double high) {
		return (Math.random() * (high - low)) + low;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
