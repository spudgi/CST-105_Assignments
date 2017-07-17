package application;

import java.util.ArrayList;
import java.util.Scanner;

import application.PlayerManager.player;
import javafx.beans.property.StringProperty;

public class PlayerManager {
	
	player {
		int name;
		int position;
		int stats;		
	
	}
	
	static class player {
		
		public int getPlayer() {
			// TODO Auto-generated method stub
			return 0;
		}
		public int getPosition() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	private StringProperty name;
	private StringProperty position;
	private StringProperty stats;
	private void position(final String players) {
		addName(this.getName());
		addPosition(this.getPosition());
		addStats(this.getStats());
	}

	public StringProperty getName() {
		return getName();
	}
	
	public StringProperty getPosition() {
		return getPosition();
	}
	
	private StringProperty getStats() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addName(StringProperty name, Scanner addName) {
		this.name = name;

		for (int i = 0; i < 52; i++)
            addName = new Scanner(System.in);
            System.out.print("Name:");
			addName = nextLine();
	}

	public void addPosition(StringProperty position, Scanner addPosition) {
		this.position = position;
		for (int j = 0; j < 52; j++)
			addPosition = new Scanner(System.in);
	        System.out.print("Position:");
			addPosition = nextLine();
	}

	public void addStats(StringProperty stats, Scanner addStats) {
		this.stats = stats;
		for (int k = 0; k < 52; k++)
			addStats = new Scanner(System.in);
	        System.out.print("Stats:");
			addStats = nextLine();
			
	}

	private Scanner nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}
