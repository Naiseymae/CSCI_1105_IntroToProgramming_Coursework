
/* 
* Author: Renee Linford
* Date: 4-27-19
* Intro to Programming Exercise 8-37: Guess the capitals
* 
*/

import java.util.Scanner;

public class Exercise_8_37 {
	
	public static void main(String[] args) {
	/* Program a prompt to user to guess state capital in an array of 10 states. User inputs guess, & output reports is answer is correct.*/
	
	
		
	// Array of 10 states & their capitals.
		String[][] list = {
				{"Mississppi", "jackson"},
				{"Montana", "butte"},
				{"Maryland", "annapolis"},
				{"Virginia", "richmond"},
				{"Colorado", "denver"},
				{"California", "sacramento"},
				{"Nebraska", "lincoln"},
				{"Kentucky", "frankfort"},
				{"Texas", "austin"},
				{"Florida", "tallahassee"}
		};
		
		
	// Program randomly selects a state from array.
		int randomRow = (int)(Math.random()*10); // Selects random row.
		String randomState = list[randomRow][0]; // Selects random state.
		
		
	// Prompt user for guess. (Not case sensitive)
		System.out.print("What is the capital of " + randomState + "? ");
		Scanner input = new Scanner(System.in);
		String guess = input.nextLine();
		// change user guess to all lowercase.
		String guessLC = guess.toLowerCase();
		
		
	// Check if guess matches state capital.
		String capital = list[randomRow][1]; 
		
		// Grabs capitol string at previously determined random row.
		if (guessLC.equals(capital)) {// If a match, output is "Correct."
			System.out.print("Correct!");
		}
		else { // If not a match, output is "Incorrect."
			System.out.print("Incorrect.");
		}
	
		
	}
}
	

