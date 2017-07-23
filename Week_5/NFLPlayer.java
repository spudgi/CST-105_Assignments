//Caleb Miller
	//CST-105
		//20170716
			//I love coding!! It is so much fun! 

package application;

import java.util.Random;

public class NFLPlayer {

	private String Name,Position,Team,College,NFLTeam;
	private int Power,Agility,Yardage,Speed,Fumbles,Evasive,Hands,Blocking,Coverage;
	private String[] firstNames = {"Arden","Sam","Harold","Mason","Derwin","Christian","Derrius","Saquon","Courtland","Tarvarus","James","Josh","Minkah","Tyquan ","Mike ","Connor ","Bradley ","Deon ","Luke ","Derrick ","Christian ","Martinas ","Lamar ","Malik ","Jaire ","Vita ","Calvin ","Jerome ","Mitch ","Micah ","Orlando ","Royce ","Josh ","Quenton ","Baker ","Marcus ","Cameron ","Ronald ","Tyrone ","Antonio ","Nick ","Josh ","Maurice ","Equanimeous ","Duke ","Da'Shawn ","Kendall ","Auden ","Bo ","Dre'Mont ","Martez ","Jake ","Armani ","Marquis ","Quin ","Davin ","Damian ","Parris ","Sony ","Adonis ","Mason ","Sam ","Mike ","Billy ","Dante ","Myles ","Clelin ","Carlton ","Akrum ","Iman ","Jaylon ","Ronnie ","Kalen ","Quinton ","Mark ","Anthony ","Mike ","Jordan ","Jarrett ","Frank ","Tegray ","Larry ","Damien ","Troy ","Porter ","Lavon ","Byron ","Godwin ","Dorance  ","Jamar ","Mike ","Lowell ","Reginald  Jr.","Deondre ","Azeem ","Da'Ron ","Trey ","Trey ","Tony ","Jaylen "};
	private String[] lastNames = {"Key","Darnold","Landry","Rudolph","James","Wilkins","Guice","Barkley","Sutton","McFadden","Washington","Rosen","Fitzpatrick","Lewis","McGlinchey","Williams","Chubb","Cain","Falk","Nnadi","Kirk","Rankin","Jackson","Jefferson","Alexander","Vea","Ridley","Baker","Hyatt","Kiser","Brown","Freeman","Sweat","Nelson","Mayfield","Allen","Smith","Jones II","Crowder","Callaway","Chubb","Allen","Hurst","St. Brown","Ejiofor","Hand","Joseph","Tate","Scarbrough","Jones","Ivey","Browning","Watts","Haynes","Blanding","Bellamy","Prince","Campbell","Michel","Alexander","Cole","Hubbard","Gesicki","Price","Pettis","Gaskin","Ferrell","Davis","Wadley","Marshall","Ferguson","Harrison","Ballage","Flowers","Andrews","Averett","Weber","Thomas","Stidham","Ragnow","Scales","Allan Jr.","Harris","Fumagalli","Gustin","Coleman","Cowart","Igwebuike","Armstrong Jr.","Summers","McCray","Lotulelei","Kahlil McKenzie Jr.","Francois","Victor","Payne","Adams","Marshall","Brown","Smith"};
	private String[] playerPosition = {"Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"};
	private String[] playerCollege = {"Alabama","Arizona State","Arkansas","Auburn","Boston College","Clemson","Connecticut","Florida","Florida State","Georgia","Harvard","Indiana","Iowa","Kansas","Louisiana Tech","Louisville","LSU","Maryland","Michigan","Mississippi State","NC State","Northwestern","Notre Dame","Ohio State","Oklahoma","Oklahoma State","Ole Miss","Oregon","Penn State","South Florida","Southern California","Southern Methodist","Tennessee","Texas","Texas A&M","UCLA","Utah","Virginia","Virginia Tech","Wake Forest","Washington","Washington State","Wisconsin","Wyoming"};
	private String[] NFLTeams = {"Baltimore Ravens","Arizona Cardinals","Buffalo Bills","Atlanta Falcons","Cincinnati Bengals","Carolina Panthers","Cleveland Browns","Chicago Bears","Denver Broncos","Dallas Cowboys","Houston Texans","Detroit Lions","Indianapolis Colts","Green Bay Packers","Jacksonville Jaguars","Los Angeles Rams","Kansas City Chiefs","Minnesota Vikings","Los Angeles Chargers","New Orleans Saints","Miami Dolphins","New York Giants","New England Patriots","Philadelphia Eagles","New York Jets","San Francisco 49ers","Oakland Raiders","Seattle Seahawks","Pittsburgh Steelers","Tampa Bay Buccaneers","Tennessee Titans","Washington Redskins"};
	
    public String getName() { 
    	return Name; 
    }
    
    public void setName(String Name) { 
    	this.Name = Name; 
    }
    
    public String getNFLTeam() { 
    	return NFLTeam; 
    }
    
    public void setNFLTeam(String NFL_Team) { 
    	this.NFLTeam = NFL_Team; 
    }
    
    public String getPosition() { 
    	return Position; 
    }
    
    public void setPosition(String Position) { 
    	this.Position = Position; 
    }
    
    public String getTeam() { 
    	return Team; 
    }
    
    public void setTeam(String Team) { 
    	this.Team = Team; 
    }
    
    public String getCollege() { 
    	return College; 
    }
    
    public void setCollege(String College) { 
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
    	return "\nPlayer: " + getName() + "\nPosition: " + getPosition() + "\nTeam: " + getTeam() + "\nCollege: " + getCollege() + "\nPower: " + getPower() + "%" + "\nAgility: " + getAgility() + "%" + "\nYardage: " + getYards() + "%" + "\nSpeed: " + getSpeed() + "%" + "\nOverall Average: " + getOverall() + "%";
    }
    
    public int randNum(int low, int high) {
    	Random randomNumber = new Random();
    	return randomNumber.nextInt(high) + low;
    }

    public NFLPlayer() {
    	setName(firstNames[randNum(0,99)] + " " + lastNames[randNum(0,99)]);
    	setPosition(playerPosition[randNum(0,13)]);
    	setTeam("2018 Prospects");
    	setCollege(playerCollege[randNum(0,45)]);
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
    
    public NFLPlayer(String name, String position, String team, String college, int power, int agility, int yardage, int speed, int fumbles, int evasive, int hands, int blocking, int coverage){
    	setName(name);
    	setPosition(position);
    	setTeam(team);
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
