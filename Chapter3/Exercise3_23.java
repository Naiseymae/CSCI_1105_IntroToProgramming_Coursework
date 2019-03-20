
/*Author: Renee Linford
 * Date: 3/18/19
 * 
 * Programming Exercise 3-23: Point in a Rectangle.
 */

import java.util.Scanner;

public class Exercise3_23 {

	public static void main(String[] args) {
		
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		double x = 0.0;
		double y = 0.0;
		double width = 0.0;
		double height = 0.0;
		
		// Prompt user for coordinates.
		System.out.println("Please input values for x and y coordinates.");
		System.out.print("Enter x value: ");
		x = input.nextDouble();
		System.out.print("Enter y value: ");
		y = input.nextDouble();
		
		// Determine if coordinates are inside rectangle with a width of 10 and height of 5.
		height = (5.0/2);
		width = (10/2);
		
		// Output indicating if coordinates are or are not inside rectangle.
		if ((x <= width) && (y <= height)) 
			System.out.print("Point (");
			System.out.printf("%1.0f", x);
			System.out.print(", ");
			System.out.printf("%1.0f", y);
			System.out.print(") is in the rectangle.");
		
		if ((x > width) || (y > height))
			System.out.print("Coordinates are not inside rectangle.");
			
	}
}
