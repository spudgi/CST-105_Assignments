//Caleb Miller
	//CST-105
		//20170721
			//I cannot get this to print out correctly....

package application;

import java.util.ArrayList;

public class PlayerManager {	
		OffensivePlayer[] offensivePlayers = new OffensivePlayer[6];
		DefensivePlayer[] defensivePlayers = new DefensivePlayer[6];
		ArrayList<NFLPlayer> Players = new ArrayList<NFLPlayer>();
		
    public String toString() {
		String outputText = "";
    	for(int i = 0; i < Players.size(); i++) {
    		outputText += Players.get(i).toString() + "\n";
    	}
    	return outputText;
    }
    
    public PlayerManager() {
    	for(int i = 0; i < offensivePlayers.length; i++) {
    		Players.add(createOffensivePlayer.toString());
    	}
    	for(int i = 0; i < defensivePlayers.length; i++) {
    		Players.add(createDefensivePlayer.toString());
    	}
    }
    
    public OffensivePlayer createOffensivePlayer() {
    	return new OffensivePlayer();
    }
    
    public DefensivePlayer createDefensivePlayer() {
    	return new DefensivePlayer();
    }    
}