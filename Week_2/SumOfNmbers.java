import java.util.Scanner;
public class SumOfNmbers { 
	public static void main(String args[]) { 
		System.out.print("Enter a 5-digit integer to calculate sum of digits:");
		Scanner sc = new Scanner(System.in);  
		int number = sc.nextInt(); 
		int sum = 0; 
		int input = number; 
		while (input != 0) { 
			int lastdigit = input % 10; 
			sum += lastdigit; 
			input /= 10; 
		} 
		System.out.printf("Sum of the digits of %d is %d", number, sum); 
	} 
}