/*
 * Author: Renee Linford
 * Date: 4-3-19
 * Intro to Programming Exercise 6-25: Converting milliseconds
 */

import java.util.Scanner;

public class Exercise_6_25 {


	public static String convertMillis(long millis) {
		// Returns a string as hours:minutes:seconds.

		long totalSeconds = (millis / 1000);
		long currentSecond = (totalSeconds % 60);
		long totalMinutes = (totalSeconds / 60);
		long currentMinute = (totalMinutes % 60);
		long totalHours = (totalMinutes / 60);

		String convertedNum = ("" + totalHours + ":" + currentMinute + ":" + currentSecond);
		return convertedNum;	
	}


	public static void main(String[] args) { 

		Scanner input = new Scanner(System.in);
		System.out.print("Enter millis: ");

		// Print matrix of 0s and 1s.
		long number = input.nextLong();
		// Display the matrix grid.
		System.out.print(convertMillis(number));
	}


}


