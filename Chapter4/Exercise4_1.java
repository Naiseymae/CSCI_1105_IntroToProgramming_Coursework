
/*Author: Renee Linford
 * Date: 3/20/19
 * 
 * Programming Exercise 4-1: Area of a pentagon
 */
import java.util.Scanner;

public class Exercise4_1 {

	public static void main(String[] args) {
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		double area = 0.0;
		double side = 0.0;
		double radius = 0.0;
		final double PI = 3.14159; 
		double radians = 0.0;
		
		// Prompt user for length of pentagon radius
		System.out.print("Enter the length of pentagon radius (from center to vertex): ");
		radius = input.nextDouble();
		
		// Calculate the side of pentagon from radius
		// s = 2r * sin(PI/5)
		double r = radius;
		radians = Math.sin(PI/5);
		side = (2 * r) * radians;
		
		// Calculate the area of the pentagon
		// Area = (5 * s^2)/(4 * tan(PI/5))
		double s = side;
		area = (5 * (Math.pow(s, 2)))/(4 * Math.tan(PI/5));
		
		// Display the area of the pentagon
		System.out.printf("The area of the pentagon is %4.2f", area);
		
	
	}


}
