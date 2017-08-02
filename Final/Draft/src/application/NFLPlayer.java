//Caleb Miller
	//CST-105
		//20170721
			//I love coding!! It is so much fun! 

package application;

import java.util.Random;

abstract public class NFLPlayer {

	public String Name,Position,College,NFLTeam;
	public int Power,Agility,Yardage,Speed,Fumbles,Evasive,Hands,Blocking,Coverage;
	public String[] firstNames = {"Arden","Sam","Harold","Mason","Derwin","Christian","Derrius","Saquon","Courtland","Tarvarus","James","Josh","Minkah","Tyquan ","Mike ","Connor ","Bradley ","Deon ","Luke ","Derrick ","Christian ","Martinas ","Lamar ","Malik ","Jaire ","Vita ","Calvin ","Jerome ","Mitch ","Micah ","Orlando ","Royce ","Josh ","Quenton ","Baker ","Marcus ","Cameron ","Ronald ","Tyrone ","Antonio ","Nick ","Josh ","Maurice ","Equanimeous ","Duke ","Da'Shawn ","Kendall ","Auden ","Bo ","Dre'Mont ","Martez ","Jake ","Armani ","Marquis ","Quin ","Davin ","Damian ","Parris ","Sony ","Adonis ","Mason ","Sam ","Mike ","Billy ","Dante ","Myles ","Clelin ","Carlton ","Akrum ","Iman ","Jaylon ","Ronnie ","Kalen ","Quinton ","Mark ","Anthony ","Mike ","Jordan ","Jarrett ","Frank ","Tegray ","Larry ","Damien ","Troy ","Porter ","Lavon ","Byron ","Godwin ","Dorance  ","Jamar ","Mike ","Lowell ","Reginald  Jr.","Deondre ","Azeem ","Da'Ron ","Trey ","Trey ","Tony ","Jaylen "};
	public String[] lastNames = {"Key","Darnold","Landry","Rudolph","James","Wilkins","Guice","Barkley","Sutton","McFadden","Washington","Rosen","Fitzpatrick","Lewis","McGlinchey","Williams","Chubb","Cain","Falk","Nnadi","Kirk","Rankin","Jackson","Jefferson","Alexander","Vea","Ridley","Baker","Hyatt","Kiser","Brown","Freeman","Sweat","Nelson","Mayfield","Allen","Smith","Jones II","Crowder","Callaway","Chubb","Allen","Hurst","St. Brown","Ejiofor","Hand","Joseph","Tate","Scarbrough","Jones","Ivey","Browning","Watts","Haynes","Blanding","Bellamy","Prince","Campbell","Michel","Alexander","Cole","Hubbard","Gesicki","Price","Pettis","Gaskin","Ferrell","Davis","Wadley","Marshall","Ferguson","Harrison","Ballage","Flowers","Andrews","Averett","Weber","Thomas","Stidham","Ragnow","Scales","Allan Jr.","Harris","Fumagalli","Gustin","Coleman","Cowart","Igwebuike","Armstrong Jr.","Summers","McCray","Lotulelei","Kahlil McKenzie Jr.","Francois","Victor","Payne","Adams","Marshall","Brown","Smith"};
	public String[] playerPosition = {"Center","Cornerback","Defensive End","Defensive Tackle","Kicker","Guard","Linebacker","Offensive Tackle","Punter","Quarterback","Running Back","Safety","Tight End","Wide Receiver"};
	public String[] playerCollege = {"Alabama","Arizona State","Arkansas","Auburn","Boston College","Clemson","Connecticut","Florida","Florida State","Georgia","Harvard","Indiana","Iowa","Kansas","Louisiana Tech","Louisville","LSU","Maryland","Michigan","Mississippi State","NC State","Northwestern","Notre Dame","Ohio State","Oklahoma","Oklahoma State","Ole Miss","Oregon","Penn State","South Florida","Southern California","Southern Methodist","Tennessee","Texas","Texas A&M","UCLA","Utah","Virginia","Virginia Tech","Wake Forest","Washington","Washington State","Wisconsin","Wyoming"};
	public String[] NFLTeams = {"Baltimore Ravens","Arizona Cardinals","Buffalo Bills","Atlanta Falcons","Cincinnati Bengals","Carolina Panthers","Cleveland Browns","Chicago Bears","Denver Broncos","Dallas Cowboys","Houston Texans","Detroit Lions","Indianapolis Colts","Green Bay Packers","Jacksonville Jaguars","Los Angeles Rams","Kansas City Chiefs","Minnesota Vikings","Los Angeles Chargers","New Orleans Saints","Miami Dolphins","New York Giants","New England Patriots","Philadelphia Eagles","New York Jets","San Francisco 49ers","Oakland Raiders","Seattle Seahawks","Pittsburgh Steelers","Tampa Bay Buccaneers","Tennessee Titans","Washington Redskins"};
	
    abstract String getName();
    
    abstract void setName(String Name);
    
    abstract String getNFLTeam();
    
    abstract void setNFLTeam(String NFL_Team); 
    
    abstract String getPosition();
    
    abstract void setPosition(String Position);
    
    abstract String getCollege();
    
    abstract void setCollege(String College); 
    
    abstract int getPower();
    
    abstract void setPower(int Power);
    
    abstract int getAgility();
    
    abstract void setAgility(int Agility);
    
    abstract int getYards();
    
    abstract void setYards(int Yardage); 
    
    abstract int getSpeed();
    
    abstract void setSpeed(int Speed);
    
    abstract int getFumbles();
    
    abstract void setFumbles(int Fumbles);
    
    abstract int getEvasive();
    
    abstract void setEvasive(int Evasive); 
    
    abstract int getHands();
    
    abstract void setHands(int Hands); 
    
    abstract int getBlocking();
    
    abstract void setBlocking(int Blocking);
    
    abstract int getCoverage();
    
    abstract void setCoverage(int Coverage);
    
    abstract int getOverall();
	
    public String toString() {
    	return "\nPlayer: " + getName() + "\nPosition: " + getPosition() + "\nTeam: " + getNFLTeam() + "\nCollege: " + getCollege() + "\nPower: " + getPower() + "%" + "\nAgility: " + getAgility() + "%" + "\nYardage: " + getYards() + "%" + "\nSpeed: " + getSpeed() + "%" + "\nOverall Average: " + getOverall() + "%";
    }
    
    public int randNum(int low, int high) {
    	Random randomNumber = new Random();
    	return randomNumber.nextInt(high) + low;
    }
}
