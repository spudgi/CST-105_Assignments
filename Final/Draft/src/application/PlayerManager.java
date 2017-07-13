package application;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;

public class PlayerManager<players> {
	 

	public static void main(String[] args) {
		ArrayList players = new ArrayList();
		addPlayer(players);
		

	}
	
	public PlayerManager() {
		int QuarterBack;
		int RunningBack;
		int WideReceiver;
		int OffensiveLine;
		int Tackle;
		int DefensiveLine;
		int DefensiveEnd;
		int DefensiveBack;
		int player;
		int position;
		int name;
		
	
	}
	
	private static class player {
		
		public int getPlayer() {
			// TODO Auto-generated method stub
			return 0;
		}
		public int getPosition() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	private StringProperty player;
	private StringProperty position;
	private StringProperty name;
	private void position(String players) {
		player = this.getPlayer();
		position = this.getPosition();
		name = this.getName();
	}
	
	public StringProperty getName() {
		return getName();
	}
	
	public StringProperty getPlayer() {
		return getPlayer();
	}
	
	public StringProperty getPosition() {
		return getPosition();
	}
	
	private static void addPlayer(ArrayList players) {
        for (int i = 0; i < 2; i++) {
            Scanner addPlayer = new Scanner(System.in);
            String player = (addPlayer.nextLine());

            Scanner addPosition = new Scanner(System.in);
            String position = (addPosition.nextLine());
            
            Scanner addName = new Scanner(System.in);
            String name = (addName.nextLine());

            players.add(new player());
        }
        System.out.println(players);
    }
	
	public class PlayerOverviewController {
	    @FXML
	    private ListView<players> player;

	    @FXML
	    private Label firstNameLabel;
	    
	    @FXML
	    private Label lastNameLabel;
	    
	    @FXML
	    private Label positionLabel;
	    
	    @FXML
	    private Label TouchDownsLabel;
	    
	    @FXML
	    private Label YardsLabel;
	    
	    @FXML
	    private Label RecYardsLabel;

	    // Reference to the main application.
	    private Main main;

	    /**
	     * The constructor.
	     * The constructor is called before the initialize() method.
	     */
	    public PlayerOverviewController() {
	    }

	    /**
	     * Initializes the controller class. This method is automatically called
	     * after the fxml file has been loaded.
	     */
	   

	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param main
	     */
	    public void setMainApp(Main main) {
	        this.main = main;


	    }
	}
}
