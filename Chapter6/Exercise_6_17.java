/* 
 * Author: Renee Linford
 * Date: 4-3-19
 * Intro to Programming Exercise 6-17: Display matrix of 0s & 1s
 * 
 */

import java.util.Scanner;

public class Exercise_6_17 {
	
	
	public static void printMatrix(int number) {
		// Method generates n-by-n matrix of 0s and 1s.
		
		int numRows = number; // Number of rows in matrix.
		
		while (numRows > 0) { 
			/* 
			* Loop generates random single-digit integers and
			* converts them to 0 if even and 1 if odd. 
			* Loop continues until number of rows is 0. 
			*/
			for (int width = number; width > 0; width--) { 
				// Inner loop for matrix width.
				System.out.print((int)(Math.random() * 2)); 
				// Prints a 0 or 1, then decrease width.
				// (int)(Math.random() * (upper - (lower + 1)))
			}
			System.out.println();
			numRows--; // Decrease number of rows.
		}
	}
	
	
	public static void main(String[] args) { 
		// Call printMatrix method.
		
		// Declare scanner input.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for an integer.
		System.out.print("Enter a number: ");
		
		// Print matrix of 0s and 1s.
		int number = input.nextInt();
		printMatrix(number); // Display the matrix grid.
	}

	
}
