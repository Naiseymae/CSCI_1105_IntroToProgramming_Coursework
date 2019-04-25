/* 
* Author: Renee Linford
* Date: 4-25-19
* Intro to Programming Exercise 7-5: Print distance numbers in array
* 
*/
	
import java.util.Scanner;

public class Exercise_7_5d {

	public static void main(String[] args) {


		// Define variables & arrays.
		int [] numList = new int[10];
		int index = 0;
		int [] distinctList = new int[10];
		

		// User inputs 10 numbers.
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter ten integers: ");
		// Loop copies numbers into numList array.
		for (index = 0; index < 10; index++) {
			numList[index] = input.nextInt();
		}
		
		
		// Loop compares numbers of both arrays for duplicates.
		index = 0;
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
		
		
		// Print distinct numbers.
		System.out.println();
		System.out.println("The number of distinct numbers is: " + index);
		

		// Print array without duplicates.	
		System.out.println();
		System.out.print("Array without duplicates: ");
		for (int i = 0; i < index; i++) {
			System.out.print(distinctList[i] + " ");
		}

		
	}
}
