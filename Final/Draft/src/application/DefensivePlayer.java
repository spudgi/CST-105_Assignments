//Caleb Miller
	//CST-105
		//20170721
			//Still a bit lost
package application;

public class DefensivePlayer extends NFLPlayer {
	
	private String[] defensivePlayers = {
		"Cornerback","Defensive End","Defensive Tackle","Linebacker","Safety"
	};
	
	String getName() { 
    	return Name; 
    }
    
    void setName(String name) { 
    	this.Name = name; 
    }
    
    String getNFLTeam() { 
    	return NFLTeam; 
    }
    
    void setNFLTeam(String team) { 
    	this.NFLTeam = team; 
    }
    
    String getPosition() { 
    	return Position; 
    }
    
    void setPosition(String position) { 
    	this.Position = position; 
    }
    
    String getCollege() { 
    	return College; 
    }
    
    void setCollege(String college) { 
    	this.College = college; 
    }
    
    public int getPower() { 
    	return Power; 
    }
    
    public void setPower(int power) { 
    	this.Power = power; 
    }
    
    public int getAgility() { 
    	return Agility; 
    }
    
    public void setAgility(int agility) { 
    	this.Agility = agility; 
    }
    
    public int getYards() { 
    	return Yardage; 
    }
    
    public void setYards(int yardage) { 
    	this.Yardage = yardage; 
    }
    
    public int getSpeed() { 
    	return Speed; 
    }
    
    public void setSpeed(int speed) { 
    	this.Speed = speed; 
    }
    
    public int getFumbles() { 
    	return Fumbles; 
    }
    
    public void setFumbles(int fumbles) { 
    	this.Fumbles = fumbles; 
    }
    
    public int getEvasive() { 
    	return Evasive; 
    }
    
    public void setEvasive(int evasive) { 
    	this.Evasive = evasive; 
    }
    
    public int getHands() { 
    	return Hands; 
    }
    
    public void setHands(int hands) { 
    	this.Hands = hands; 
    }
    
    public int getBlocking() { 
    	return Blocking; 
    }
    
    public void setBlocking(int blocking) { 
    	this.Blocking = blocking; 
    }
    
    public int getCoverage() { 
    	return Coverage; 
    }
    
    public void setCoverage(int coverage) { 
    	this.Coverage = coverage; 
    }
    
    public int getOverall() {
    	return (Power + Agility + Yardage + Speed + Fumbles + Evasive + Hands + Blocking + Coverage) / 9;
    }
    
    public String toString() {
    	return "\nPlayer: " + getName() + "\nDefensive Position: " + getPosition() + "\nTeam: " + getNFLTeam() + "\nCollege: " + getCollege() + "\nPower: " + getPower() + "%" + "\nAgility: " + getAgility() + "%" + "\nYardage: " + getYards() + "%" + "\nSpeed: " + getSpeed() + "%" + "\nOverall Average: " + getOverall() + "%";
    }
	
	public DefensivePlayer() {
		setName(firstNames[randNum(0, 99)] + " " + lastNames[randNum(0, 99)]);
    	setPosition(defensivePlayers[randNum(0, 5)]);
    	setNFLTeam("2018 Prospects");
    	setCollege(playerCollege[randNum(0, 45)]);
    	setPower(randNum(1,100));
    	setAgility(randNum(1,100));
    	setYards(randNum(1,100));
    	setSpeed(randNum(1,100));
    	setFumbles(randNum(1,100));
    	setEvasive(randNum(1,100));
    	setHands(randNum(1,100));
    	setBlocking(randNum(1,100));
    	setCoverage(randNum(1,100));
    }
	
	public DefensivePlayer(String Position) {
		setName(firstNames[randNum(0, 99)] + " " + lastNames[randNum(0, 99)]);
    	setPosition(Position);
    	setNFLTeam("2018 Prospects");
    	setCollege(playerCollege[randNum(0, 44)]);
    	setPower(randNum(1,100));
    	setAgility(randNum(1,100));
    	setYards(randNum(1,100));
    	setSpeed(randNum(1,100));
    	setFumbles(randNum(1,100));
    	setEvasive(randNum(1,100));
    	setHands(randNum(1,100));
    	setBlocking(randNum(1,100));
    	setCoverage(randNum(1,100));
    }
	
    public DefensivePlayer(String name, String position, String team, String college, int power, int agility, int yardage, int speed, int fumbles, int evasive, int hands, int blocking, int coverage){
    	setName(name);
    	setPosition(position);
    	setNFLTeam(team);
    	setCollege(college);
    	setPower(power);
    	setAgility(agility);
    	setYards(yardage);
    	setSpeed(speed);
    	setFumbles(fumbles);
    	setEvasive(evasive);
    	setHands(hands);
    	setBlocking(blocking);
    	setCoverage(coverage);    	
    }		
}
