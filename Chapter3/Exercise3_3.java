package chapter3;

/*Author: Renee Linford
 * Date: 3/14/19
 * 
 * This is Programming Exercise 3-3: Solve 2 * 2 Linear Equations.
 */

import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Define variables
		double a = 0.0, b = 0.0, c = 0.0, d = 0.0, e = 0.0, f = 0.0;
		double x, y; 

		//Prompt user for integers to plug into Cramer's equation
		//x = (ed - bf)/(ad - bc)
		//y = (af - ec)/(ad - bc)
		System.out.println("Enter a number for each variable below.");
		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.print("Enter c: ");
		c = input.nextDouble();
		System.out.print("Enter d: ");
		d = input.nextDouble();
		System.out.print("Enter e: ");
		e = input.nextDouble();
		System.out.print("Enter f: ");
		f = input.nextDouble();
		x = (e * d - b * f)/(a * d - b * c);
		y = (a * f - e * c)/(a * d - b * c);
		double denominator = (a * d - b * c);

		//Check that (ad - bc) is not zero.  If zero, do not calculate.
		//Solve equation using input & display results for x and y
		if (denominator == 0) {
			System.out.println("Cannot divide by zero.");
		}
		else  {
			System.out.println("x = " + x);
			System.out.println("y = " + y); 
		}

	}

}
