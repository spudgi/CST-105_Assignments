//Caleb Miller
	//CST-105
		//20170716
			//I cannot get this to print out correctly....

package application;

import java.util.ArrayList;

public class PlayerManager extends NFLPlayer {	
		static ArrayList<OffensivePlayer> OffensivePlayer = new ArrayList<>();
		
		ArrayList<DefensivePlayer> DefensivePlayer = new ArrayList<>();
		
PlayerManager[] Players = new PlayerManager[6];
    public String toString() {
		String outputText = "";
    	for(int i = 0; i < Players.length; i++) {
    		outputText += Players[i].toString() + "\n";
    	}
    	return outputText;
    }
}