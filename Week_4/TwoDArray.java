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
			line = line.replace(" ", "@");
			int row = 20;
			int col = 45;
			String[][] arrays = new String[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
				}
			System.out.println(arrays);
			}
			
		}
		
	}
}

