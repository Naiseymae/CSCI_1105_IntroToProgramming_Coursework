package chapter4;

/*Author: Renee Linford
 * Date: 3/21/19
 * 
 * Programming Exercise 4-23: Financial application (Payroll)
 */

import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {
		
		// Define variables.
		Scanner input = new Scanner(System.in);
		double hoursPerWeek = 0.0;
		double hourlyPayRate = 0.0;
		double fedTaxRate = 0.0;
		double stateTaxRate = 0.0;
		double payRate = 0.0;
		double grossPay = 0.0;
		double netPay = 0.0;
		double fedWithholding = 0.0;
		double stateWithholding = 0.0;
		double totalDeductions = 0.0;
		double fedWithholdingPercent = 0.0;
		double stateWithholdingPercent = 0.0;
		
		// Prompt user for employee tax information.
		System.out.print("Enter employee's name: ");
		String employeeName = input.next();
		System.out.print("Enter number of hours worked: ");
		hoursPerWeek = input.nextDouble();
		System.out.print("Enter hourly pay rate: $");
		hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		fedTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		stateTaxRate = input.nextDouble();
		System.out.println();
		
		// Calculate gross pay.
		grossPay = hoursPerWeek * hourlyPayRate;
		
		// Calculate total tax deductions from both federal and state withholdings.
		fedWithholding = grossPay * fedTaxRate;
		fedWithholdingPercent = fedTaxRate * 100;
		stateWithholding = grossPay * stateTaxRate;
		stateWithholdingPercent = stateTaxRate * 100;
		totalDeductions = fedWithholding + stateWithholding;
		
		// Calculate net pay.
		netPay = grossPay - totalDeductions;
		
		// Display information in a payroll statement.
		System.out.printf("Employee Name: %s\n", employeeName);
		System.out.printf("Hours Worked: %4.1f\n", hoursPerWeek);
		System.out.printf("Pay Rate: $%4.2f\n", hourlyPayRate);
		System.out.printf("Gross Pay: $%4.2f\n", grossPay);
		System.out.println("Deductions: ");
		System.out.printf("\t Federal Withholding at %4.1f percent: $%3.2f\n", fedWithholdingPercent, fedWithholding);
		System.out.printf("\t State Withholding at %4.1f percent: $%3.2f\n", stateWithholdingPercent, stateWithholding);
		System.out.printf("\t Total Deduction: $%4.2f\n", totalDeductions);
		System.out.printf("Net Pay: $%4.2f\n", netPay);
		

	}

}
