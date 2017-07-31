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

	ObservableList<NFLPlayer> players = createPlayers();

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		table.setEditable(false);
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table = createPlayerTable(table);

		final VBox playerTable = new VBox();
		playerTable.setSpacing(5);
		playerTable.setPadding(new Insets(10, 0, 0, 10));
		playerTable.getChildren().addAll(table);

		createControls(pane);
		pane.setCenter(playerTable);
		pane.setBottom(draftControls(pane));

		Scene scene = new Scene(pane, 1200, 700);
		scene.getStylesheets().add("application.css");
		primaryStage.setResizable(false);
		primaryStage.setTitle("NFL Draft");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		updatePlayerTable(0);
	}

	@SuppressWarnings("unchecked")
	public TableView<NFLPlayer> createPlayerTable(TableView<NFLPlayer> table) {

		TableColumn<NFLPlayer, String> nflteamCol = new TableColumn<>("NFL Teams");
		nflteamCol.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("NFLTeams"));
		
		TableColumn<NFLPlayer, String> nameCol = new TableColumn<>("Name");
		nameCol.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("lastNames"));
		
		nameCol.setMinWidth(25);
		TableColumn<NFLPlayer, String> positionCol = new TableColumn<>("Player Position");
		positionCol.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("playerPosition"));
		
		TableColumn<NFLPlayer, String> collegeCol = new TableColumn<>("Player College");
		collegeCol.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("playerCollege"));
		collegeCol.setMinWidth(75);
		
		table.getColumns().addAll(nflteamCol, nameCol, positionCol, collegeCol);
		return table;
	}

	@SuppressWarnings("rawtypes")
	public void createControls(BorderPane pane) {
	
		final HBox controls = new HBox();
		controls.setSpacing(5);
		controls.setPadding(new Insets(10, 10, 10, 10));
		Separator separator = new Separator();
		Separator separator2 = new Separator();
		Separator separator3 = new Separator();
		Separator separator4 = new Separator();
		Separator separator5 = new Separator();
		Separator separator6 = new Separator();
		separator.setStyle("-fx-opacity: 0;");
		separator2.setStyle("-fx-opacity: 0;");
		separator3.setStyle("-fx-opacity: 0;");
		separator4.setStyle("-fx-opacity: 0;");
		separator5.setStyle("-fx-opacity: 0;");
		separator6.setStyle("-fx-opacity: 0;");
		ImageView logo = new ImageView(new Image("http://www.spudgi.com/wp-content/uploads/2017/07/CST-Draft.png",400, 200, true, true));
		logo.setStyle("-fx-opacity: .87");
		
		@SuppressWarnings("unchecked")
		ChoiceBox listOfPostions = new ChoiceBox(FXCollections.observableArrayList("Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"));
		listOfPostions.getSelectionModel().selectFirst();
		listOfPostions.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			
					@Override
					public void changed(ObservableValue<? extends Number> observableValue,Number number, Number number2) {
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
		
		Button resetBtn = new Button("reset");
		resetBtn.focusedProperty().addListener(new ChangeListener<Boolean>() {
			
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1, Boolean arg2) {
				searchField.setText("");
				listOfPostions.getSelectionModel().selectFirst();
				updatePlayerTable(0);
			}
		});
		
		controls.getChildren().addAll(listOfPostions, searchField, searchBtn,resetBtn, separator, separator2, separator3, separator4,separator5, separator6, logo);
		pane.setTop(controls);
	}
	
	public void updatePlayerTable(int i) {
		
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(players,p -> true);
		
		switch (i) {
		case 0:
			filteredPlayers = new FilteredList<>(players, p -> true);
			break;
		case 1:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Center");
			break;
		case 2:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Cornerback");
			break;
		case 3:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Defensive End");
			break;
		case 4:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Defensive Tackle");
			break;
		case 5:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Kicker");
			break;
		case 6:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Guard");
			break;
		case 7:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Linebacker");
			break;
		case 8:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Offensive Tackle");
			break;
		case 9:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Punter");
			break;
		case 10:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Quarterback");
			break;
		case 11:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Running Back");
			break;
		case 12:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Safety");
			break;
		case 13:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Tight End");
			break;
		case 14:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Wide Receiver");
			break;
		}

		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
		table.refresh();
	}
	
	public void managePlayerTable(int i) {
		
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(players,p -> p.getNFLTeam() == "Drafted");

		switch (i) {
		case 0:
			filteredPlayers = new FilteredList<>(players,p -> p.getNFLTeam() == "Drafted");
			break;
		case 1:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Center"&& p.getNFLTeam() == "Drafted");
			break;
		case 2:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Cornerback"&& p.getNFLTeam() == "Drafted");
			break;
		case 3:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Defensive End"&& p.getNFLTeam() == "Drafted");
			break;
		case 4:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Defensive Tackle"&& p.getNFLTeam() == "Drafted");
			break;
		case 5:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Kicker"&& p.getNFLTeam() == "Drafted");
			break;
		case 6:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Guard"&& p.getNFLTeam() == "Drafted");
			break;
		case 7:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Linebacker"&& p.getNFLTeam() == "Drafted");
			break;
		case 8:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Offensive Tackle"&& p.getNFLTeam() == "Drafted");
			break;
		case 9:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Punter"&& p.getNFLTeam() == "Drafted");
			break;
		case 10:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Quarterback"&& p.getNFLTeam() == "Drafted");
			break;
		case 11:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Running Back"&& p.getNFLTeam() == "Drafted");
			break;
		case 12:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Safety"&& p.getNFLTeam() == "Drafted");
			break;
		case 13:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Tight End"&& p.getNFLTeam() == "Drafted");
			break;
		case 14:
			filteredPlayers = new FilteredList<>(players,p -> p.getPosition() == "Wide Receiver"&& p.getNFLTeam() == "Drafted");
			break;
		}

		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
		table.refresh();
	}
	
	public void searchPlayerTable(String s) {
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(players,p -> p.getPosition().toLowerCase().contains(s.toLowerCase()));		
		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
	}

	public void searchManagementTable(String s) {
		FilteredList<NFLPlayer> filteredPlayers = new FilteredList<>(players,p -> p.getNFLTeam() == "Drafted"|| p.getNFLTeam() == "Drafted"|| p.getNFLTeam() == "Drafted"|| p.getNFLTeam() == "Drafted"&& p.getNFLTeam().toLowerCase().contains(s.toLowerCase()));
		SortedList<NFLPlayer> sortedPlayers = new SortedList<>(filteredPlayers);
		table.setItems(sortedPlayers);
	}

	public HBox draftControls(BorderPane pane) {
		
		final HBox draft = new HBox();
		draft.setSpacing(5);
		draft.setPadding(new Insets(10, 10, 100, 10));
		Button draftBtn = new Button("Draft Player");
		draftBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				NFLPlayer draftPlayer = table.getSelectionModel()
						.getSelectedItem();
				draftPlayer.setNFLTeam("Drafted");
				updatePlayerTable(0);
			}
		});
		
		Separator separator = new Separator();
		Separator separator2 = new Separator();
		Separator separator3 = new Separator();
		separator.setStyle("-fx-opacity: 0;");
		separator2.setStyle("-fx-opacity: 0;");
		separator3.setStyle("-fx-opacity: 0;");
		Button teamBtn = new Button("Manage Team");
		teamBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				createManagementControls(pane);
				managePlayerTable(0);
				pane.setBottom(manageControls(pane));
			}
		});
		
		draft.getChildren().addAll(draftBtn, separator, separator2, separator3,
				teamBtn);
		return draft;
	}

	public HBox manageControls(BorderPane pane) {
		
		final HBox management = new HBox();
		management.setSpacing(5);
		management.setPadding(new Insets(10, 10, 100, 10));
		Button draftBtn = new Button("Remove Player");
		draftBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				NFLPlayer draftPlayer = table.getSelectionModel()
						.getSelectedItem();
				draftPlayer.setNFLTeam("2018 Prospects");
				managePlayerTable(0);
			}
		});
		
		Separator separator = new Separator();
		Separator separator2 = new Separator();
		Separator separator3 = new Separator();
		separator.setStyle("-fx-opacity: 0;");
		separator2.setStyle("-fx-opacity: 0;");
		separator3.setStyle("-fx-opacity: 0;");
		Button teamBtn = new Button("Draft Players");
		teamBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				createControls(pane);
				pane.setBottom(draftControls(pane));
				updatePlayerTable(0);
			}
		});
		
		management.getChildren().addAll(draftBtn, separator, separator2,separator3, teamBtn);
		return management;
	}

	@SuppressWarnings("unchecked")
	public void createManagementControls(BorderPane pane) {
		
		final HBox controls = new HBox();
		controls.setSpacing(5);
		controls.setPadding(new Insets(10, 10, 10, 10));
		Separator separator = new Separator();
		Separator separator2 = new Separator();
		Separator separator3 = new Separator();
		Separator separator4 = new Separator();
		Separator separator5 = new Separator();
		Separator separator6 = new Separator();
		separator.setStyle("-fx-opacity: 0;");
		separator2.setStyle("-fx-opacity: 0;");
		separator3.setStyle("-fx-opacity: 0;");
		separator4.setStyle("-fx-opacity: 0;");
		separator5.setStyle("-fx-opacity: 0;");
		separator6.setStyle("-fx-opacity: 0;");
		ImageView logo = new ImageView(new Image("http://www.spudgi.com/wp-content/uploads/2017/07/CST-Draft.png",400, 200, true, true));
		logo.setStyle("-fx-opacity: .87");
		@SuppressWarnings("rawtypes")
		ChoiceBox listOfPostions = new ChoiceBox(FXCollections.observableArrayList("Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"));
		listOfPostions.getSelectionModel().selectFirst();
		listOfPostions.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			
					@Override
					public void changed(ObservableValue<? extends Number> observableValue,Number number, Number number2) {
						managePlayerTable((int) number2);
					}
				});

		TextField searchField = new TextField("Search");
		searchField.setPrefColumnCount(15);
		searchField.focusedProperty().addListener(
				new ChangeListener<Boolean>() {
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
					searchManagementTable(searchField.getText());
				}
			}
		});
		
		Button resetBtn = new Button("reset");
		resetBtn.focusedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> arg0,Boolean arg1, Boolean arg2) {
				searchField.setText("");
				listOfPostions.getSelectionModel().selectFirst();
				managePlayerTable(0);
			}
		});
		
		controls.getChildren().addAll(listOfPostions, searchField, searchBtn,resetBtn, separator, separator2, separator3, separator4,separator5, separator6, logo);
		pane.setTop(controls);
	}

	public ObservableList<NFLPlayer> createPlayers() {
		ArrayList<NFLPlayer> playerList = new ArrayList<NFLPlayer>();

		for (int x = 0; x < 200; x++) {
			playerList.add(new OffensivePlayer());
		}
		for (int y = 0; y < 200; y++) {
			playerList.add(new DefensivePlayer());
		}

		return FXCollections.observableList(playerList);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
