package chapter2;

/*Author: Renee Linford
 * Date 3/14/19
 * 
 * This is Programming Exercise 2-23: Cost of Driving
 */
import java.util.Scanner;

public class Exercise2_23 {

	public static void main(String[] args) {
		//Declare Variables
		Scanner input = new Scanner(System.in);
		double distance = 0.0;
		double miles_per_gallon = 0.0;
		double price_per_gallon = 0.0;
		double cost_of_driving = 0.0;
		
		//Prompt user input for miles per gallon and price per gallon
		System.out.println("Below we calculate the cost of a car trip.");
		System.out.println();
		System.out.print("Enter the driving distance in miles: ");
			distance = input.nextDouble();
		System.out.print("Enter the car's miles per gallon: ");
			miles_per_gallon = input.nextDouble();
		System.out.print("Enter the price of gas per gallon: $");
			price_per_gallon = input.nextDouble();
			
		//Calculate cost of trip
			cost_of_driving = (distance * price_per_gallon / miles_per_gallon);
			
		//Display cost of trip
		System.out.print("The cost of driving is: $");
		System.out.printf("%.2f", cost_of_driving);	

	}

}
