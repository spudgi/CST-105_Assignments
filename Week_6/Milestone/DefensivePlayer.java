package application;

public abstract class DefensivePlayer extends NFLPlayer {
	private int Tackles,Sacks,Interceptions,returnedTD,forcedFumbles,fumbleRecovery,Safties;
	private String Name;
	private String Position;
	
	public DefensivePlayer() {
		
	}
	
	public void setTackles(int Tackles) {
		this.Tackles = Tackles;
	}
	
	public int getTackles() {
		return this.Tackles;
	}
	
	public void setSacks(int Sacks) {
		this.Sacks = Sacks;
	}
	
	public int getSacks() {
		return this.Sacks;
	}
	
	public void setInterceptions(int Interceptions) {
		this.Interceptions = Interceptions;
	}
	
	public int getInterceptions() {
		return this.Interceptions;
	}
	
	public void setreturnTD(int returnTD) {
		this.returnedTD = returnTD;
	}
	
	public int getreturnTD() {
		return this.returnedTD;
	}
	
	public void setforcedFumbles(int forcedFumbles) {
		this.forcedFumbles = forcedFumbles;
	}
	
	public int getforcedFumbles() {
		return this.forcedFumbles;
	}
	
	public void setfumbleRecovery(int fumbleRecovery) {
		this.fumbleRecovery = fumbleRecovery;
	}
	
	public int getfumbleRecovery() {
		return this.fumbleRecovery;
	}
	
	public void setSafties(int Safties) {
		this.Safties = Safties;
	}
	
	public int getSafties() {
		return this.Safties;
	}
	
	@Override
	public String toString() {
    	return "\nPlayer: " + getName() + "\nPosition: " + getPosition() + "\nTeam: " + getTeam() + "\nCollege: " + getCollege() + "\nTackles: " + getTackles() + "%" + "\nSacks " + getSacks() + "%" + "\nInterceptions: " + getInterceptions() + "%" + "\nReturn TD " + getreturnTD() + "%" + "\nForced Fumbles: " + getforcedFumbles() + "%" + "\nFumble Recovery: " + getfumbleRecovery() + "%" + "\nSafties: " + getSafties() + "%";
    }
	
	public DefensivePlayer(String Name, String Position , int Tackles, int Sacks, int Interceptions, int returnedTD, int forcedFumbles, int fumbleRecovery, int Safties) {

    	setName(Name);
		setPosition(Position);
		setTackles(Tackles);
		setSacks(Sacks);
		setInterceptions(Interceptions);
		setreturnTD(returnedTD);
		setforcedFumbles(forcedFumbles);
		setfumbleRecovery(fumbleRecovery);
		setSafties(Safties);
	}
		
}
