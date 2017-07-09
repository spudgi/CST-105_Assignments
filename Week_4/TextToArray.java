import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextToArray {

	public static String[][] read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("\test.txt"));
		  int columnCount = 20;
		  int rowCount = 45;
		  String[][] content = new String[rowCount][columnCount];

		  for (int i = 0; i < rowCount; i++) {
		    String line = br.readLine();

		    for (int j = 0; j < columnCount; j++) {
		      content[i][j] = String.valueOf(line.charAt(j));
		    }
		  }
		  br.close();
	  return content;
	}
	public static void main(String[] args) {
	}
}
