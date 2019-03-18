package chapter3;

/*Author: Renee Linford
 * Date: 3/14/19
 * 
 * Programming Exercise 3-19: Perimeter of a triangle.
 */
import java.util.Scanner;

public class Exercise3_19 {

	public static void main(String[] args) {


		// Define variables.
		Scanner input = new Scanner(System.in);
		double edge1 = 0.0;
		double edge2 = 0.0;
		double edge3 = 0.0;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		double perimeter = 0.0;

		// Prompt user for input for triangle edges.
		System.out.println("Compute the perimeter of a triangle. "
				+ "Enter the 3 sides of a triangle.");
		System.out.print("Side 1 = ");
		edge1 = input.nextDouble();
		System.out.print("Side 2 = ");
		edge2 = input.nextDouble();
		System.out.print("Side 3 = ");
		edge3 = input.nextDouble();

		// Compute the sums of the triangle edges and the perimeter.
		sum1 = edge1 + edge2;
		sum2 = edge2 + edge3;
		sum3 = edge3 + edge1;
		perimeter = edge1 + edge2 + edge3;

		// Check the edges to check for an invalid triangle.
		if (sum1 > edge3) {
			if (sum2 > edge1) {
				if (sum3 > edge2) {
					System.out.print("The perimeter of a triangle is " + perimeter + " .");
				}
			}
		}
		else {
			System.out.print("The input is invalid.");
		}

	}

}
