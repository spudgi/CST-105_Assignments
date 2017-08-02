package application;
//Caleb Miller
	//20170730
		//This is my own product
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	private TableView<NFLPlayer> table = new TableView<NFLPlayer>();

	ObservableList<NFLPlayer> prospectPlayer = createPlayers();

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		table.setEditable(false);
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table = PlayerTable(table);

		final VBox playerTable = new VBox();
		playerTable.setSpacing(5);
		playerTable.setPadding(new Insets(10, 10, 10, 10));
		playerTable.getChildren().addAll(table);

		createControls(pane);
		pane.setCenter(playerTable);
		pane.setBottom(draftControls(pane));

		Scene scene = new Scene(pane, 1200, 750);
		scene.getStylesheets().add("/images/application.css");
		primaryStage.setResizable(false);
		primaryStage.setTitle("NFL Draft");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		updatePlayerTable(0);
	}

	public TableView<NFLPlayer> PlayerTable(TableView<NFLPlayer> table) {
		
		TableColumn<NFLPlayer, String> nameList = new TableColumn<NFLPlayer, String>("Name");

		nameList.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("Name"));
		
			nameList.setMinWidth(25);
		
		TableColumn<NFLPlayer, String> posList = new TableColumn<NFLPlayer, String>("Player Position");
		
		posList.setCellValueFactory(new PropertyValueFactory<NFLPlayer,String>("Position"));
		
		TableColumn<NFLPlayer, String> collegeList = new TableColumn<>("Player College");
		
		collegeList.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("College"));
		
			collegeList.setMinWidth(75);
			
		TableColumn<NFLPlayer, String> teamList = new TableColumn<>("NFL Teams");
		
		teamList.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("NFLTeam"));

		table.getColumns().addAll(nameList, posList, collegeList, teamList);
		
		
		return table;
			
	}

	public void createControls(BorderPane pane) {
	
		final HBox controls = new HBox();
		controls.setSpacing(5);
		controls.setPadding(new Insets(10, 10, 10, 10));
		Separator sep = new Separator();
		Separator sep2 = new Separator();
		Separator sep3 = new Separator();
		Separator sep4 = new Separator();
		Separator sep5 = new Separator();
		Separator sep6 = new Separator();
		sep.setStyle("-fx-opacity: 0;");
		sep2.setStyle("-fx-opacity: 0;");
		sep3.setStyle("-fx-opacity: 0;");
		sep4.setStyle("-fx-opacity: 0;");
		sep5.setStyle("-fx-opacity: 0;");
		sep6.setStyle("-fx-opacity: 0;");
		ImageView logo = new ImageView(new Image("/images/CST-Draft1.PNG",500, 200, true, true));
		logo.setStyle("-fx-opacity: .87");
		
		ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList("Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"));
		cb.getSelectionModel().selectFirst();
		cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				updatePlayerTable((int) number2);
			}
		});

		TextField searchField = new TextField("Search");
		searchField.setPrefColumnCount(15);
		searchField.focusedProperty().addListener(new ChangeListener<Boolean>() {
	
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1, Boolean arg2) {
				if (searchField.getText().contains("Search")) {
					searchField.setText("");
				}
			}
		});

		Button searchBtn = new Button("search");
		searchBtn.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent e) {
				if (searchField.getText() != ""|| searchField.getText() != "Search") {
					searchPlayerTable(searchField.getText());
				}
			}
		});

		controls.getChildren().addAll(cb, searchField, searchBtn, sep, sep2, sep3, sep4, sep5, sep6, logo);
		pane.setTop(controls);
	}
	
	public void updatePlayerTable(int i) {
		
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(prospectPlayer, p -> true);
		
		switch (i) {
		case 0:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> true);
			break;
		case 1:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Center");
			break;
		case 2:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Cornerback");
			break;
		case 3:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Defensive End");
			break;
		case 4:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Defensive Tackle");
			break;
		case 5:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Kicker");
			break;
		case 6:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Guard");
			break;
		case 7:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Linebacker");
			break;
		case 8:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Offensive Tackle");
			break;
		case 9:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Punter");
			break;
		case 10:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Quarterback");
			break;
		case 11:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Running Back");
			break;
		case 12:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Safety");
			break;
		case 13:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Tight End");
			break;
		case 14:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Wide Receiver");
			break;
		}

		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
		table.refresh();
	}
	
	public void myPlayerTable(int i) {
		
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getNFLTeam() == "Drafted");

		switch (i) {
		case 0:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getNFLTeam() == "Drafted");
			break;
		case 1:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Center"&& p.getNFLTeam() == "Drafted");
			break;
		case 2:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Cornerback"&& p.getNFLTeam() == "Drafted");
			break;
		case 3:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Defensive End"&& p.getNFLTeam() == "Drafted");
			break;
		case 4:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Defensive Tackle"&& p.getNFLTeam() == "Drafted");
			break;
		case 5:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Kicker"&& p.getNFLTeam() == "Drafted");
			break;
		case 6:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Guard"&& p.getNFLTeam() == "Drafted");
			break;
		case 7:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Linebacker"&& p.getNFLTeam() == "Drafted");
			break;
		case 8:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Offensive Tackle"&& p.getNFLTeam() == "Drafted");
			break;
		case 9:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Punter"&& p.getNFLTeam() == "Drafted");
			break;
		case 10:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Quarterback"&& p.getNFLTeam() == "Drafted");
			break;
		case 11:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Running Back"&& p.getNFLTeam() == "Drafted");
			break;
		case 12:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Safety"&& p.getNFLTeam() == "Drafted");
			break;
		case 13:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Tight End"&& p.getNFLTeam() == "Drafted");
			break;
		case 14:
			filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getPosition() == "Wide Receiver"&& p.getNFLTeam() == "Drafted");
			break;
		}

		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
		table.refresh();
	}
	
	public void searchPlayerTable(String s) {
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getName() || p.getPosition() || p.getCollege() ||  p.getNFLTeam());
		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
	}

	public void searchTable(String s) {
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(prospectPlayer, p -> p.getNFLTeam() == "Drafted"&& p.getPosition().toLowerCase().contains(s.toLowerCase())|| p.getNFLTeam() == "Drafted"&& p.getCollege().toLowerCase().contains(s.toLowerCase())|| p.getNFLTeam() == "Drafted"&& p.getName().toLowerCase().contains(s.toLowerCase())|| p.getNFLTeam() == "Drafted"&& p.getNFLTeam().toLowerCase().contains(s.toLowerCase()));
		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
	}
	
	public HBox mainControls(BorderPane pane) {
		
		final HBox owner = new HBox();
		owner.setSpacing(5);
		owner.setPadding(new Insets(10, 10, 100, 10));
		Button draftBtn = new Button("Remove Player");
		draftBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				NFLPlayer draftPlayer = table.getSelectionModel().getSelectedItem();
				draftPlayer.setNFLTeam("2018 Prospects");
				myPlayerTable(0);
			}
		});
		
		Separator sep = new Separator();
		Separator sep2 = new Separator();
		Separator sep3 = new Separator();
		sep.setStyle("-fx-opacity: 0;");
		sep2.setStyle("-fx-opacity: 0;");
		sep3.setStyle("-fx-opacity: 0;");
		Button teamBtn = new Button("Update Players");
		teamBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				createControls(pane);
				pane.setBottom(draftControls(pane));
				updatePlayerTable(0);
			}
		});
		
		owner.getChildren().addAll(draftBtn, sep, sep2, sep3, teamBtn);
		
		return owner;
	}

	public HBox draftControls(BorderPane pane) {
		
		final HBox draft = new HBox();
		draft.setSpacing(5);
		draft.setPadding(new Insets(10, 10, 10, 10));
		Button draftBtn = new Button("Draft Player");
		draftBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				NFLPlayer draftPlayer = table.getSelectionModel().getSelectedItem();
				draftPlayer.setNFLTeam("Drafted");
				updatePlayerTable(0);
			}
		});
		
		Separator sep = new Separator();
		Separator sep2 = new Separator();
		Separator sep3 = new Separator();
		sep.setStyle("-fx-opacity: 0;");
		sep2.setStyle("-fx-opacity: 0;");
		sep3.setStyle("-fx-opacity: 0;");
		Button teamBtn = new Button("My Team");
		teamBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				createControls(pane);
				myPlayerTable(0);
				pane.setBottom(mainControls(pane));
			}
		});
		
		draft.getChildren().addAll(draftBtn, sep, sep2, sep3, teamBtn);
		return draft;
	}

	public void userControls(BorderPane pane) {
		
		final HBox controls = new HBox();
		controls.setSpacing(5);
		controls.setPadding(new Insets(10, 10, 10, 10));
		Separator sep = new Separator();
		Separator sep2 = new Separator();
		Separator sep3 = new Separator();
		Separator sep4 = new Separator();
		Separator sep5 = new Separator();
		Separator sep6 = new Separator();
		sep.setStyle("-fx-opacity: 0;");
		sep2.setStyle("-fx-opacity: 0;");
		sep3.setStyle("-fx-opacity: 0;");
		sep4.setStyle("-fx-opacity: 0;");
		sep5.setStyle("-fx-opacity: 0;");
		sep6.setStyle("-fx-opacity: 0;");
		ImageView logo = new ImageView(new Image("/images/CST-Draft1.PNG",500, 200, true, true));
		logo.setStyle("-fx-opacity: .87");
	
		ChoiceBox<String> cb1 = new ChoiceBox<String>(FXCollections.observableArrayList("Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"));
		cb1.getSelectionModel().selectFirst();
		cb1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		
			@Override
			public void changed(ObservableValue<? extends Number> observableValue,Number number, Number number2) {
				myPlayerTable((int) number2);
			}
		});

		TextField searchField = new TextField("Search");
		searchField.setPrefColumnCount(15);
		searchField.focusedProperty().addListener(new ChangeListener<Boolean>() {
			
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1, Boolean arg2) {
				if (searchField.getText().contains("Search")) {
					searchField.setText("");
				}
			}
		});
	
		Button searchBtn = new Button("search");
		searchBtn.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent e) {
				if (searchField.getText() != ""|| searchField.getText() != "Search") {
					searchTable(searchField.getText());
				}
			}
		});
	
		controls.getChildren().addAll(cb1, searchField, searchBtn, sep, sep2, sep3, sep4, sep5, sep6, logo);
		pane.setTop(controls);
	}

	public ObservableList<NFLPlayer> createPlayers() {
		ArrayList<NFLPlayer> posPlayers = new ArrayList<NFLPlayer>();

		for (int x = 0; x < 12; x++) {
			posPlayers.add(new OffensivePlayer());
		}
		for (int y = 0; y < 12; y++) {
			posPlayers.add(new DefensivePlayer());
		}

		return FXCollections.observableList(posPlayers);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
