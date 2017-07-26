//Caleb Miller
	//CST-105
		//20170721
			//I cannot get this to print out correctly....

package application;

import java.util.ArrayList;

public class PlayerManager {	
		static OffensivePlayer[] offensivePlayer = new OffensivePlayer[11];
		static DefensivePlayer[] defensivePlayer = new DefensivePlayer[11];
		static ArrayList<NFLPlayer> Players = new ArrayList<NFLPlayer>();
		
    public String toString() {
		String outputText = "";
    	for(int i = 0; i < Players.size(); i++) {
    		outputText += Players.get(i).toString() + "\n";
    	}
    	return outputText;
    }
    
    public OffensivePlayer makeoffensivePlayer() {
    		return new OffensivePlayer();
    	
    }  
    
    public DefensivePlayer makedefensivePlayer() {
    		return new DefensivePlayer();
	}
    	
    
	    public PlayerManager() {
	    	for(int i = 0; i < offensivePlayer.length; i++) {
				Players.add(makeoffensivePlayer());
	    	}
	    	
	    	for(int i = 0; i < defensivePlayer.length; i++) {
	    		Players.add(makedefensivePlayer());
	    	}
	    }
}