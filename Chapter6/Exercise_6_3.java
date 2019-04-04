/* 
 * Author: Renee Linford
 * Date: 4-3-19
 * Intro to Programming Exercise 6-3: Palindrome Integer
 * 
 */

import java.util.Scanner;

public class Exercise_6_3 {


	public static int reverse(int number) { 
		// Method will return reverse of an integer. 
		
		// Define variables.
		int reverse = 0; 
		
		// Loop: isolate last digit of number then add it to reversed number.
		while (number > 0) {
			int lastDigit = number % 10; // Isolate last digit
			number = number / 10; // Decrease number in loop.
			reverse = reverse * 10 + lastDigit; // Add last digit to final reverse number.
		}
		return reverse; // Returns reverse of number.
	}
	
	
	public static boolean isPalindrome(int number) { 
		// Method will return true if number is a palindrome.
		
		// Define variables.
		int reverse = reverse(number);
		
		// Boolean: if number is palindrome, returns true.
		if (number == reverse) {
			return true;
		}
		 return false;
	}	
		
	
	public static void main(String[] args) { 
		// Calls reverse and isPalindrome method.
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for number.
		System.out.print("Enter an integer: ");
		
		// Call reverse integer method & print reverse. 
		int number = input.nextInt();
		int reverse = reverse(number);
		System.out.println("The reverse integer is: " + reverse);
		
		// Call isPalindrome method.
		if (isPalindrome(number) == true) {
			System.out.print("The number " + number + " is a palindrome!");
			// Will print statement if number is a palindrome.
		}
	}

	
}
