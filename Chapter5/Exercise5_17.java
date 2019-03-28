
/*Author: Renee Linford
 * Date: 3/25/19
 * 
 * Programming Exercise 5-17: Display Pyramid
 */ 

import java.util.Scanner;

public class Exercise5_17 {

	public static void main(String[] args) {


		// Define variables.
		Scanner input = new Scanner(System.in);

		// Prompt user for integer between 1 & 15.
		System.out.print("Please enter number of rows (1-15): ");
		int userInput = input.nextInt();

		// Outer loop with 3 inner loops to display pyramid.
		for (int numRows = 1; numRows <= userInput; numRows++) {
			System.out.println();
			for (int spaces = (userInput - numRows); spaces > 0; spaces--) {
				System.out.print("   ");
			}
			for (int leftNum = numRows; leftNum > 1; leftNum--) {
				System.out.printf("%3d", leftNum); 	
			}
			for (int rightNum = 1; rightNum <= numRows; rightNum++) {
				System.out.printf("%3d", rightNum); 
			}
		}

		
		
	}

}


