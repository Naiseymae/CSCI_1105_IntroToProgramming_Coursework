/* 
* Author: Renee Linford
* Date: 4-25-19
* Intro to Programming Exercise 7-15: Elimiate duplicates in an array
* 
*/

import java.util.Scanner;

public class Exercise_7_15 {
	
	public static int[] eliminateDuplicates(int[] numList) {
		// Define variables & arrays.
		int [] distinctList = new int[10];
		int index = 0;
		
				
		// Loop compares numbers of both arrays for duplicates.
		for (int j = 0; j < 10; j++) { // Grabs "j" to check.
			boolean isDistinct = true;
			// Boolean is true unless next loop finds duplicate number in array.
				for (int k = j + 1; k < 10; k++) { 
					if (numList[j] == numList[k]) { // Checks "j" with "k".
					isDistinct = false;
					}
				}
				// If no duplicates found, add distinct number to new array.
				if (isDistinct == true) {
					distinctList[index] = numList[j];
					index++;
				}
		}


		// Copy distinct numbers into new array.
		int [] noDuplicates = new int[index];
		for (int l = 0; l < index; l++) { 
			// Only copy numbers that are not duplicated.
			noDuplicates[l] = distinctList[l];
		}

		// Return array without duplicates.
		return noDuplicates;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		// Define variables & arrays.
		int [] userInput = new int[10];
		
		
		// Prompt user for 10 numbers.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers separated by a space: ");
		
		
		// Loop copies numbers into array.
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextInt();
		}
		
		// Copy user input into a new array.
		int [] list = eliminateDuplicates(userInput);
		
		
		// Call elimateDuplicates method.
		System.out.println();
		System.out.println("The number of distinct numbers is " + list.length);	
	
		
		// Print new array.
		System.out.println();
		System.out.print("Array without duplicates: ");
		for (int e : list) {
			System.out.print(e + " ");
		}
		
	}
	
	
}