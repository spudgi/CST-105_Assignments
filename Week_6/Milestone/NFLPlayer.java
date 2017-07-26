//Caleb Miller
	//CST-105
		//20170721
			//I love coding!! It is so much fun! 

package application;

import java.util.Random;

public abstract class NFLPlayer {

	protected String Name;
	protected String Position;
	protected String Team;
	protected String College;
	protected String NFLTeam;
	protected int Power;
	protected int Agility;
	protected int Yardage;
	protected int Speed;
	protected int Fumbles;
	protected int Evasive;
	protected int Hands;
	protected int Blocking;
	protected int Coverage;
	protected String[] firstNames = {"Arden","Sam","Harold","Mason","Derwin","Christian","Derrius","Saquon","Courtland","Tarvarus","James","Josh","Minkah","Tyquan ","Mike ","Connor ","Bradley ","Deon ","Luke ","Derrick ","Christian ","Martinas ","Lamar ","Malik ","Jaire ","Vita ","Calvin ","Jerome ","Mitch ","Micah ","Orlando ","Royce ","Josh ","Quenton ","Baker ","Marcus ","Cameron ","Ronald ","Tyrone ","Antonio ","Nick ","Josh ","Maurice ","Equanimeous ","Duke ","Da'Shawn ","Kendall ","Auden ","Bo ","Dre'Mont ","Martez ","Jake ","Armani ","Marquis ","Quin ","Davin ","Damian ","Parris ","Sony ","Adonis ","Mason ","Sam ","Mike ","Billy ","Dante ","Myles ","Clelin ","Carlton ","Akrum ","Iman ","Jaylon ","Ronnie ","Kalen ","Quinton ","Mark ","Anthony ","Mike ","Jordan ","Jarrett ","Frank ","Tegray ","Larry ","Damien ","Troy ","Porter ","Lavon ","Byron ","Godwin ","Dorance  ","Jamar ","Mike ","Lowell ","Reginald  Jr.","Deondre ","Azeem ","Da'Ron ","Trey ","Trey ","Tony ","Jaylen "};
	protected String[] lastNames = {"Key","Darnold","Landry","Rudolph","James","Wilkins","Guice","Barkley","Sutton","McFadden","Washington","Rosen","Fitzpatrick","Lewis","McGlinchey","Williams","Chubb","Cain","Falk","Nnadi","Kirk","Rankin","Jackson","Jefferson","Alexander","Vea","Ridley","Baker","Hyatt","Kiser","Brown","Freeman","Sweat","Nelson","Mayfield","Allen","Smith","Jones II","Crowder","Callaway","Chubb","Allen","Hurst","St. Brown","Ejiofor","Hand","Joseph","Tate","Scarbrough","Jones","Ivey","Browning","Watts","Haynes","Blanding","Bellamy","Prince","Campbell","Michel","Alexander","Cole","Hubbard","Gesicki","Price","Pettis","Gaskin","Ferrell","Davis","Wadley","Marshall","Ferguson","Harrison","Ballage","Flowers","Andrews","Averett","Weber","Thomas","Stidham","Ragnow","Scales","Allan Jr.","Harris","Fumagalli","Gustin","Coleman","Cowart","Igwebuike","Armstrong Jr.","Summers","McCray","Lotulelei","Kahlil McKenzie Jr.","Francois","Victor","Payne","Adams","Marshall","Brown","Smith"};
	protected String[] playerPosition = {"Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"};
	protected String[] playerCollege = {"Alabama","Arizona State","Arkansas","Auburn","Boston College","Clemson","Connecticut","Florida","Florida State","Georgia","Harvard","Indiana","Iowa","Kansas","Louisiana Tech","Louisville","LSU","Maryland","Michigan","Mississippi State","NC State","Northwestern","Notre Dame","Ohio State","Oklahoma","Oklahoma State","Ole Miss","Oregon","Penn State","South Florida","Southern California","Southern Methodist","Tennessee","Texas","Texas A&M","UCLA","Utah","Virginia","Virginia Tech","Wake Forest","Washington","Washington State","Wisconsin","Wyoming"};
	protected String[] NFLTeams = {"Baltimore Ravens","Arizona Cardinals","Buffalo Bills","Atlanta Falcons","Cincinnati Bengals","Carolina Panthers","Cleveland Browns","Chicago Bears","Denver Broncos","Dallas Cowboys","Houston Texans","Detroit Lions","Indianapolis Colts","Green Bay Packers","Jacksonville Jaguars","Los Angeles Rams","Kansas City Chiefs","Minnesota Vikings","Los Angeles Chargers","New Orleans Saints","Miami Dolphins","New York Giants","New England Patriots","Philadelphia Eagles","New York Jets","San Francisco 49ers","Oakland Raiders","Seattle Seahawks","Pittsburgh Steelers","Tampa Bay Buccaneers","Tennessee Titans","Washington Redskins"};
	
    String getName() { 
    	return Name; 
    }
    
    void setName(String Name) { 
    	this.Name = Name; 
    }
    
    String getNFLTeam() { 
    	return NFLTeam; 
    }
    
    void setNFLTeam(String NFL_Team) { 
    	this.NFLTeam = NFL_Team; 
    }
    
    String getPosition() { 
    	return Position; 
    }
    
    void setPosition(String Position) { 
    	this.Position = Position; 
    }
    
    String getTeam() { 
    	return Team; 
    }
    
    void setTeam(String Team) { 
    	this.Team = Team; 
    }
    
    String getCollege() { 
    	return College; 
    }
    
    void setCollege(String College) { 
    	this.College = College; 
    }
    
    int getPower() { 
    	return Power; 
    }
    
    void setPower(int Power) { 
    	this.Power = Power; 
    }
    
    int getAgility() { 
    	return Agility; 
    }
    
    void setAgility(int Agility) { 
    	this.Agility = Agility; 
    }
    
    int getYards() { 
    	return Yardage; 
    }
    
    void setYards(int Yardage) { 
    	this.Yardage = Yardage; 
    }
    
    int getSpeed() { 
    	return Speed; 
    }
    
    void setSpeed(int Speed) { 
    	this.Speed = Speed; 
    }
    
    int getFumbles() { 
    	return Fumbles; 
    }
    
    void setFumbles(int Fumbles) { 
    	this.Fumbles = Fumbles; 
    }
    
    int getEvasive() { 
    	return Evasive; 
    }
    
    void setEvasive(int Evasive) { 
    	this.Evasive = Evasive; 
    }
    
    int getHands() { 
    	return Hands; 
    }
    
    void setHands(int Hands) { 
    	this.Hands = Hands; 
    }
    
    int getBlocking() { 
    	return Blocking; 
    }
    
    void setBlocking(int Blocking) { 
    	this.Blocking = Blocking; 
    }
    
    int getCoverage() { 
    	return Coverage; 
    }
    
    void setCoverage(int Coverage) { 
    	this.Coverage = Coverage; 
    }
    
    int getOverall() {
    	return (Power + Agility + Yardage + Speed + Fumbles + Evasive + Hands + Blocking + Coverage) / 9;
    }
	
    public String toString() {
    	return "\nPlayer: " + getName() + "\nPosition: " + getPosition() + "\nTeam: " + getTeam() + "\nCollege: " + getCollege() + "\nPower: " + getPower() + "%" + "\nAgility: " + getAgility() + "%" + "\nYardage: " + getYards() + "%" + "\nSpeed: " + getSpeed() + "%" + "\nOverall Average: " + getOverall() + "%";
    }
    
    public int randNum(int low, int high) {
    	Random randomNumber = new Random();
    	return randomNumber.nextInt(high) + low;
    }
}
