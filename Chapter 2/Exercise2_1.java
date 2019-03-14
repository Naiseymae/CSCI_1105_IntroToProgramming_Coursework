package chapter2;

/*
 * Author: Renee Linford
 * Date 3/14/19
 * 
 * This is Programming Exercise 2-1: Converting Celsius to Fahrenheit.
 */

import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		//Declare variables
		Scanner input = new Scanner(System.in);
		double fahrenheit = 0.0;
		double celsius = 0.0;
				
		//Prompt user input
		System.out.println("This formula will convert degrees Celsius to Fahrenheit.");
		System.out.println("Fahrenheit = (9/5) x Celsius + 32");
		System.out.println();
		System.out.print("Please enter degrees in Celsius: ");
		celsius = input.nextDouble();
		
		
		//Solve for Fahrenheit
		fahrenheit = ((9.0/5) * celsius + 32);
		
		//Display result
		System.out.println(celsius +" *C = " + fahrenheit +" *F");
	}

}
