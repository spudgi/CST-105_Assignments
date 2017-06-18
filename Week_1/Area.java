import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		int r;
		double pi = 3.14, area;//Declare a constant
		Scanner s = new Scanner(System.in);//Create a Scanner object
		System.out.print("Enter radius of circle:");//Prompt the user to enter a radius
		r = s.nextInt();
		area = pi * r * r;//Compute area
		System.out.println("Area of circle:"+area);//Display result
	}
}
