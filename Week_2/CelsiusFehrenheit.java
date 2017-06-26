import java.util.Scanner;
public class CelsiusFehrenheit {
	private static Scanner s;
	public static void main(String[] args) {
		double c;
		s = new Scanner(System.in);
		System.out.print("Celsius:");
		c = s.nextInt();
		double fehrenheit = (double) ((9.0 / 5.0) * c + 32);
		System.out.println("Fahrenheit:"+fehrenheit);
	}
}
