package chapter5;

/*Author: Renee Linford
 * Date: 3/25/19
 * 
 * Programming Exercise 5-11: Find numbers divisible by 5 or 6.
 */ 

import java.util.Scanner;

public class Exercise5_11 {

	public static void main(String[] args) {
		
	
		// Define variables.
		Scanner input = new Scanner(System.in);
		int output = 0;
		
		
		// Print number range and divisors.
		System.out.printf("Counting from 100 to 200.");
		System.out.println("\nDivisible by 5 or 6, but not 5 and 6.");
		System.out.println("--------------------------------------");
		
		
		// Loop count & print statements.
		for (int count = 100; count < 200; count++) {
			if (count % 5 == 0 ^ count % 6 == 0) { //If number is equal to 5 or 6, not both.
				System.out.print(count + " "); 
				output++;
			}
			if (output > 9) { //Will print no more than 10 numbers per line.
				System.out.print("\n");
				output = 0;
			}
		}
				
		
				
		

	}

}
