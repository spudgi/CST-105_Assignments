//Caleb Miller
	//CST-105
		//20170716
			//I cant believe how complicated I had it at the beginning of the week!

package application;
public class PlayerManager extends NFLPlayer {
PlayerManager[] Players = new PlayerManager[6];
    public String toString() {
		String outputText = "";
    	for(int i = 0; i < Players.length; i++) {
    		outputText += Players[i].toString() + "\n";
    	}
    	return outputText;
    }
	public PlayerManager() {
		for(int i = 0; i < Players.length; i++) {
			Players[i] = new PlayerManager();
		}
	}
}