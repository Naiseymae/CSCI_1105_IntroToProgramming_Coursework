/* 
* Author: Renee Linford
* Date: 4-25-19
* Intro to Programming Exercise 7-9: Find smallest element in array.
* 
*/

import java.util.Scanner;

public class Exercise_7_9 {
	
			
	public static void main(String[] args) {
			
		// Declare array variable.
		double [] numbers = new double[10];
			
			
		// Ask user for input.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers separated by a space: ");
			
			
		// Input placed into new array.
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}
			
			
		// Call min method. Print minimum number.
		System.out.println();
		System.out.print("The minimum number is: " + min(numbers));
		
			
	}
		
		
	public static double min(double[] array) {
	
		// Declare variables.
		double [] list = new double[10];
	
		// Take input from main and copy into new array.
		System.arraycopy(array, 0, list, 0, array.length);

	
		// Nested loops sort array into ascending order.
		for (int i = 0; i < list.length - 1; i++) { 
			int currentIndex = i; // Tracks current index number.
			double minNum = list[i]; 
		
			// Loop finds minimum number in list.
			for (int j = i + 1; j < list.length; j++) {
				if (minNum > list[j]) { /* If minNum is greater than next number in array, then "j" becomes minimum number.*/
					minNum = list[j]; 
					currentIndex = j; // Track and change current index number to "j".
				}
			}
			// If needed, swap "i" & "currentIndex".
			if (currentIndex != i) { 
				list[currentIndex] = list[i]; // Update current index number to list index "i".
				list[i] = minNum; // Set list index "i" to value of current minimum number. 
			}
		}
	
	
		// Return first index that will have smallest unit.
		double minimum = list[0];
		return minimum;

	}
	
}