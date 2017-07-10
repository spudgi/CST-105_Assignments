//Caleb Miller//
	//CST-105//
		//20170709//
			//I love this class but this kicked by butt!//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TwoDArray {
	private static char arrays[][];

	public static void main(String[] args) {
		
		String fileName = JOptionPane.showInputDialog(null, "Enter file name and path");
		Scanner fileInput =null;
		try {
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.err.print("Cannot open the file!");
			System.exit(0);
		}
		while(fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			arrays = new char[20][45];
			for (char row = 0; row < 20; row++) {
				for (char col = 0; col < 45; col++) {
				System.out.print(arrays[row][col]);
				}
			System.out.println(line);
			}
			
		}
		
	}
}

