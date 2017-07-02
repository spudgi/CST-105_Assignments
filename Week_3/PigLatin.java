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
	                if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
	                    System.out.print(word.toUpperCase() + "WAY ");
	                else if (word.startsWith("sh") || word.startsWith("ch") || word.startsWith("th"))
	                    System.out.print(word.substring(2)+word.substring(0,2).toUpperCase()+"AY ");
	                else
	                    System.out.print(word.substring(1)+word.substring(0,1).toUpperCase()+"AY ");
	            }
			System.out.println();
	        } while(!Sentence.equals("quit"));
	}
}
