	//Caleb Miller//
		//CST-105//
			//20170702//
import java.util.Scanner;
public class PigLatin {
	private static Scanner input;
	public static void main(String[] args) {
		 input = new Scanner( System.in );
	        String Sentence="";
	        do {
	            String[] words;
	            System.out.print("");
	            Sentence = input.nextLine().toUpperCase();
	            words = Sentence.split(" ");
	            for (String word : words) {
	                if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U"))
	                    System.out.print(word + "WAY ");
	                else if (word.startsWith("sh") || word.startsWith("ch") || word.startsWith("th"))
	                    System.out.print(word.substring(2)+word.substring(0,2) + "AY ");
	                else
	                    System.out.print(word.substring(1)+word.substring(0,1) + "AY ");
	            }
			System.out.println();
	        } while(!Sentence.equals("quit"));
	}
}
