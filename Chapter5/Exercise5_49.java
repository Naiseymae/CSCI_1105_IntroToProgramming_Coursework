package chapter5;

/*Author: Renee Linford
 * Date: 3/21/19
 * 
 * Programming Exercise 5-49: Count vowels and consonants
 */

import java.util.Scanner;

public class Exercise5_49 {

	public static void main(String[] args) {

		// Define variables.
		Scanner input = new Scanner(System.in);
		int vowels = 0;
		int consonants = 0;
		char A = 'A';
		char E = 'E';
		char I = 'I';
		char O = 'O';
		char U = 'U';
		int index = 0;


		// Prompt user for string statement.
		System.out.println("Write a statement. Below will show the count of vowels and consanants.");
		String statement = input.nextLine();
		statement.toUpperCase();
		double length = statement.length();


		// Count vowels & consonants in user input.
		while (length > 0) { 
			char check = statement.charAt(index); // Check characters in statement for vowels.
			check = Character.toUpperCase(check);
			if (check == A || check == E || check == I || check == O || check == U)
				vowels++; // Increase vowel count if A, E, I, O, or U.
			else if (check != A && check != E && check != I && check != O && check != U && check != ' ' && check != '.' && check != ',' && check != '?' && check != '!' && check != '"' && check != '(' && check != ')' && check != '@' && check != '$')
				// Check and exclude vowels, spaces, and symbols from consonant count. 
				consonants++; // For non-vowels letters, increase consonant count.
			index++; // Move letter index check over one spot.
			length--; // Decrease remaining statement length.
		}


		// Print out number of vowels and consonants.
		System.out.println();
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);




	}

}
