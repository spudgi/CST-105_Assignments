//Caleb Miller
	//CST-105
		//20170716
			//The further I go the more lost I become in this...

package application;

public class NFLPlayerDriver extends NFLPlayer {

	public static void main(String[] args) {
		NFLPlayer nfl_player1 = new NFLPlayer();
		System.out.println(nfl_player1.toString());
		
		nfl_player1.setCollege("Arizona State");
		addStats(nfl_player1);
		System.out.println(nfl_player1.toString());
		
		NFLPlayer nfl_player2 = new NFLPlayer("Caleb Miller", "Quarter Back", "2018 Prospects", "Grand Canyon",90,90,90,90,90,90,90,90,90);
		System.out.println(nfl_player2.toString());
		}

	public static void addStats(NFLPlayer player) {
		player.setAgility(player.getAgility() + 10);
		player.setYards(player.getYards() + 10);
		player.setFumbles(player.getFumbles() + 10);
		player.setCoverage(player.getCoverage() + 10);
		player.setEvasive(player.getEvasive() + 10);
		player.setHands(player.getHands() + 10);
		player.setSpeed(player.getSpeed() + 10);
		player.setHands(player.getHands() + 10);
		player.setBlocking(player.getBlocking() + 10);
		player.setSpeed(player.getSpeed() + 10);
		player.setPower(player.getPower() + 10);
	}
	
	public static void getNFLTeam(NFLPlayer NFL_Team) {
		NFL_Team.setNFLTeam(NFL_Team.getNFLTeam());
	}
}
