//Caleb Miller
	//CST-105
		//20170716
			//I cant believe how complicated I had it at the beginning of the week!

package application;

import java.util.ArrayList;

public class PlayerManager extends NFLPlayer {
	public PlayerManager() {
		ArrayList<NFLPlayer> NFLPlayer = new ArrayList<>();
		
		ArrayList<OffensivePlayer> offensivePlayers = new ArrayList<>();
		
		ArrayList<DefensivePlayer> defensivePlayers = new ArrayList<>();
		
		ArrayList<NFLPlayer> currentRoster = new ArrayList<>();
		
	}
	
PlayerManager[] Players = new PlayerManager[6];
    public String toString() {
		String outputText = "";
    	for(int i = 0; i < Players.length; i++) {
    		outputText += Players[i].toString() + "\n";
    	}
    	return outputText;
    }
}