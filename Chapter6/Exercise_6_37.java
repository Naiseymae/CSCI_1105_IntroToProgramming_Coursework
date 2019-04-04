/* 
 * Author: Renee Linford
 * Date: 4-4-19
 * Intro to Programming Exercise 6-37: Format an integer
 * 
 */

import java.util.Scanner;

public class Exercise_6_37 {

	public static String format(int number, int width) {
		// Method returns a string for the number with one or more prefix 0s.

		String length = Integer.toString(number); // Convert integer to string with Integer class.
		int digits = length.length(); // digits = number of characters in string length. 
		
		while (width > digits) {
			// Loop will print 0s in front of number as long as width > digits.
			System.out.print("0");
			width--;
		}
		
		return length; // Return number as a string after the printed 0s.
	}
	
	
	public static void main(String[] args) {
		// Call format method.
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for number and width.
		System.out.print("Enter integer: ");
		int number = input.nextInt();
		System.out.print("Enter width: ");
		int width = input.nextInt();
		
		// Print formatted number with format method.
		String format = format(number, width);
		System.out.print(format);

	}

}
