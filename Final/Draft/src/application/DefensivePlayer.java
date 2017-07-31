//Caleb Miller
	//CST-105
		//20170721
			//Still a bit lost
package application;

public class DefensivePlayer extends NFLPlayer {
	private String[] listOfPositions = {
			"Cornerback","Defensive End","Defensive Tackle","Linebacker","Safety"
	};
	
	String getName() { 
    	return Name; 
    }
    
    void setName(String Name) { 
    	this.Name = Name; 
    }
    
    String getNFLTeam() { 
    	return NFLTeam; 
    }
    
    void setNFLTeam(String string) { 
    	this.NFLTeam = string; 
    }
    
    String getPosition() { 
    	return Position; 
    }
    
    void setPosition(String Position) { 
    	this.Position = Position; 
    }
    
    String getCollege() { 
    	return College; 
    }
    
    void setCollege(String College) { 
    	this.College = College; 
    }
    
    public int getPower() { 
    	return Power; 
    }
    
    public void setPower(int Power) { 
    	this.Power = Power; 
    }
    
    public int getAgility() { 
    	return Agility; 
    }
    
    public void setAgility(int Agility) { 
    	this.Agility = Agility; 
    }
    
    public int getYards() { 
    	return Yardage; 
    }
    
    public void setYards(int Yardage) { 
    	this.Yardage = Yardage; 
    }
    
    public int getSpeed() { 
    	return Speed; 
    }
    
    public void setSpeed(int Speed) { 
    	this.Speed = Speed; 
    }
    
    public int getFumbles() { 
    	return Fumbles; 
    }
    
    public void setFumbles(int Fumbles) { 
    	this.Fumbles = Fumbles; 
    }
    
    public int getEvasive() { 
    	return Evasive; 
    }
    
    public void setEvasive(int Evasive) { 
    	this.Evasive = Evasive; 
    }
    
    public int getHands() { 
    	return Hands; 
    }
    
    public void setHands(int Hands) { 
    	this.Hands = Hands; 
    }
    
    public int getBlocking() { 
    	return Blocking; 
    }
    
    public void setBlocking(int Blocking) { 
    	this.Blocking = Blocking; 
    }
    
    public int getCoverage() { 
    	return Coverage; 
    }
    
    public void setCoverage(
    		int Coverage) { 
    	this.Coverage = Coverage; 
    }
    
    public int getOverall() {
    	return (Power + Agility + Yardage + Speed + Fumbles + Evasive + Hands + Blocking + Coverage) / 9;
    }
    
    public String toString() {
    	return "\nPlayer: " + getName() + "\nDefensive Position: " + getPosition() + "\nTeam: " + getNFLTeam() + "\nCollege: " + getCollege() + "\nPower: " + getPower() + "%" + "\nAgility: " + getAgility() + "%" + "\nYardage: " + getYards() + "%" + "\nSpeed: " + getSpeed() + "%" + "\nOverall Average: " + getOverall() + "%";
    }
	
	public DefensivePlayer() {
		setName(firstNames[randNum(0, 99)] + "" + lastNames[randNum(0, 99)]);
    	setPosition(listOfPositions[randNum(0, 5)]);
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
