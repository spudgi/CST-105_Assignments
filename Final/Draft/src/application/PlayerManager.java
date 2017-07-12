package application;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	 

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
		
	}
	
	private static class player {
		private String player;
		private String position;
		public int getPlayer() {
			// TODO Auto-generated method stub
			return 0;
		}
		public int getPosition() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public void position(String player) {
		player = this.getPlayer();
		String position = this.getPosition();
	}
	
	public String getPlayer() {
		return getPlayer();
	}
	
	public String getPosition() {
		return getPosition();
	}
	
	private static void addPlayer(ArrayList players) {
        for (int i = 0; i < 2; i++) {
            Scanner addPlayer = new Scanner(System.in);
            String player = (addPlayer.nextLine());

            Scanner addPosition = new Scanner(System.in);
            String position = (addPosition.nextLine());

            players.add(new player());
        }
    }
	
}
