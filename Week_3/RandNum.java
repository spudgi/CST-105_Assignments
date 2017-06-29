//Caleb Miller//
	//CST-105//
		//20170626//
import java.util.Random;
import java.util.Scanner;
public class RandNum {
	public static void main(String[] args) {
        Random rand = new Random();
        int compNum = rand.nextInt(10000);
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        int userGuess;  
        boolean win = false;        
        while (win == false ) {
        	int guesses = 0;
			guesses++;
            System.out.print("Guess a number between 1 and 10000: ");
            userGuess = keyboard.nextInt();
            count++;
            if(userGuess < 1 || userGuess > 10000) {
                System.out.println("Your guess is not between 1 and 10000.");
                System.out.println();
            }
            else if (userGuess == compNum) {
                win = true;
                System.out.println("Congratulations!");
                System.out.println("Number of tries: "+count);
            }       
            else if (userGuess < compNum) {
                System.out.println("Higher");
                System.out.println();
            }
            else if (userGuess > compNum) {
                System.out.println("Lower");
                System.out.println();
            }
        }
	}
}
