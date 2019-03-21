
/*Author: Renee Linford
 * Date: 3/21/19
 * 
 * Programming Exercise 4-17: Days of a Month.
 */

import java.util.Scanner;

public class Exercise4_17 {

	public static void main(String[] args) {
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		int year = 0; 
		int days = 0;
		int febDays = 0;
		String month = "abc";
		
		// Prompt user to enter year and first 3 letters of a month.
		System.out.print("Enter a year: ");
		year = input.nextInt();
		System.out.print("Enter first 3 letters of a month: ");
		String monthAbbrev = input.next(); 	
		monthAbbrev = monthAbbrev.toLowerCase();
	
		// Determine if year is leap year.
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if (isLeapYear == true) { febDays = 29;
		}
		if (isLeapYear == false) { febDays = 28;
		}
		

		// Determine days in the month.
		switch (monthAbbrev) {
		case "jan": days = 31; month = "January"; break;
		case "feb": days = febDays; month = "February"; break;
		case "mar": days = 31; month= "March"; break;
		case "apr": days = 30; month = "April"; break;
		case "may": days = 31; month = "May"; break;
		case "jun": days = 30; month = "June"; break;
		case "jul": days = 31; month = "July"; break;
		case "aug": days = 31; month = "August"; break;
		case "sep": days = 30; month = "September"; break;
		case "oct": days = 31; month = "October"; break;
		case "nov": days = 30; month = "November"; break;
		case "dec": days = 31; month = "December"; break;
		default: System.out.print("Error: Invalid month type.");
		System.exit(1);
		}
		
		
		// Display days of the entered month.
		System.out.print("There are " + days + " days in " + month + " " + year + ".");
		
		
	}

}
