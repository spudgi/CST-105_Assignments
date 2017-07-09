//Caleb Miller//
	//CST-105//
		//20170709//
			//I love this class! I can't get enough of it, although this week was pretty hard for me in terms of this project//
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArray {

	private static Scanner inputFile;

	public static void main(String[] args) throws IOException {
	int x = inputFile.nextInt(); 
	int y = inputFile.nextInt(); 
		while (inputFile.hasNext()) { 
		char [][] array = new char [x][y];
		   //char c = words.charAt(i);  
		    for (int row = 0; row < x; row++) {
		        for (int col = 0; col < y; col++) {
		            String words = inputFile.nextLine();
		            for (int i = 0; i < words.length(); i++)
		            array[x][y] = words.charAt(i);
		            for (int i = 0; i < words.length(); i++);
		        }
		    }
		}
	}
	public static String[][] read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("\test.txt"));
		  int columnCount = 20;
		  int rowCount = 45;
		  inputFile = new Scanner(br);
		return null;
	}
}
