/* 
* Author: Renee Linford
* Date: 4-25-19
* Intro to Programming Exercise 7-23: Locker puzzle
* 
*/

import java.util.Scanner;

public class Exercise_7_23 {		
	
	
	public static void main(String[] args) {
	
		// Declare array.
		boolean [] hallway = new boolean[100];
	
	
		/* Nested loops track students and which lockers are open and closed. 
		Lockers are closed (false) by default. */
		for (int student = 1; student <=100; student++) {
			for (int locker = student - 1; locker < 100; locker += student) { 
				/* Student 1 starts at locker 1 (index 0), and Student 2 starts at locker 2 (index 1), and so on. */
				hallway [locker] = !hallway[locker]; /* If locker is open, close locker. If locker is closed, open locker. Save open/close status to index. */
			}
		}
	
	
		// Print open lockers.
		System.out.println("Open lockers are: ");
		for (int i = 0; i < 100; i++) {
			if (hallway[i]) { // If locker at index "i" is open (true) print value.
				System.out.print(i + " ");
			}
		}
	
	
	}
}