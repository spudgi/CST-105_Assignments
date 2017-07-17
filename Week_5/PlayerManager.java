//Caleb Miller
	//CST-105
		//20170716
			//I cant believe how complicated I had it at the beginning of the week!

package application;

public class PlayerManager {
	
PlayerManager[] Players = new PlayerManager[6];
	
    public String toString() {
		String outputText = "";
    	for(int x = 0; x< Players.length;x++) {
    		outputText += Players[x].toString() + "\n";
    	}
    	return outputText;
    }
	
	public PlayerManager() {
		for(int x = 0; x< Players.length;x++) {
			Players[x] = new PlayerManager();
		}
	}
}
