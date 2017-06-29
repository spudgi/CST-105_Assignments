//Caleb Miller//
	//CST-105//
		//20170623//
import java.util.Scanner;
public class FehrenheitCelsius {
	private static Scanner s;
	public static void main(String[] args) {
		double f;
		s = new Scanner(System.in);
		System.out.print("Fehrenheit:");
		f = s.nextInt();
		double celsius = (double) ((f - 32.0) / (9.0 / 5.0));
		System.out.println("Celsius:"+celsius);
	}
}
