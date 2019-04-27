/* 
* Author: Renee Linford
* Date: 4-26-19
* Intro to Programming Exercise 8-11: Game - 9 heads and tails
* 
*/

import java.util.Scanner;

public class Exercise_8_11 {
	
	
	
	public static void main(String[] args) {
		/* Heads and Tails: 9 flipped coins in a 3x3 matrix have 512 possible outcomes. Prompt user for number between 0 & 512.  Displays a matrix of 9 coins as heads or tails.*/
			
			
			// Prompt user for a number.
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between 0 and 512: ");
			int number = input.nextInt();
			System.out.println();
			
			
			// Convert number to a string of binary numbers.
			String binaryString = Integer.toBinaryString(number);


			// Convert binary string to an integer.
			int binaryInt = Integer.parseInt(binaryString);
			
			
			// Format binary integer to have a width of 9. (i.e. binary number of "1001" returns as "000001001")
			String formatedNumber = format(binaryInt, 9);
			
					
			// Assign each number (0 or 1) in formated number string to the matrix array.
			int [] matrix = new int [9];
			for (int i = 0; i < 9; i ++) {
				matrix[i] = formatedNumber.charAt(i);
			}
			
			
			// Assign heads or tails to 0 or 1 in matrix, then print matrix.
			for (int j = 0; j < 9; j++) {
					if (matrix[j] == '0') { // 0 prints "H" for heads.
						System.out.print("H ");
					}
					if (matrix [j] == '1') { // 1 prints "T" for tails.
						System.out.print("T ");
					}
					if (j == 2 || j == 5) { // new row after 3 H/T's 
						System.out.println();
					}
			}
	}
	
	
	
	public static String format(int number, int width) {
	/* Method returns a string for the number with one or more prefix 0s. */

				String length = Integer.toString(number); // Convert integer to string with Integer class.
				int digits = length.length(); // digits is number of characters in string length. 
				
				while (width > digits) {
					// Loop will print 0s in front of number while width > digits.
					length = "0" + length; // One "0" added to length.
					digits = length.length(); // New value for digits.
				}
				
				return length; // Return number "length" as a String.
	}	
	
	
}