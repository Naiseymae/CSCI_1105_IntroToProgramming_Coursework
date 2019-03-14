package chapter2;

/* Author: Renee Linford
 * Date: 3/14/19
 * 
 * This is Programming Exercise 2-13: Financial application - compound value
 * Savings with 5% interest for 6 months.
 */
import java.util.Scanner;

public class Exercise2_13 {

	public static void main(String[] args) {
		//Declare variables
		Scanner input = new Scanner(System.in);
		double savings = 0.0;
		double interest = 0.00417;
		double month_1 = 0.0;
		double month_2 = 0.0;
		double month_3 = 0.0;
		double month_4 = 0.0;
		double month_5 = 0.0;
		double month_6 = 0.0;
		double savings_with_interest = 0.0;
		
		//Prompt user for value of monthly savings
		System.out.print("Enter monthly savings: $");
		savings = input.nextDouble();
		
		//Formula for monthly interest for 6 months
		month_1 = savings * (1 + interest);
		month_2 = (savings + month_1) * (1 + interest);
		month_3 = (savings + month_2) * (1 + interest);
		month_4 = (savings + month_3) * (1 + interest);
		month_5 = (savings + month_4) * (1 + interest);
		month_6 = (savings + month_5) * (1 + interest);
		savings_with_interest = month_6;
		
		//Display results
		System.out.print("Savings after 6 months with 5% interest: $");
		System.out.printf("%.2f", savings_with_interest);
		
	}

}
