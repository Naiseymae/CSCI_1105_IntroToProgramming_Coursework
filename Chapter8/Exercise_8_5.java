/* 
* Author: Renee Linford
* Date: 4-25-19
* Intro to Programming Exercise 8-5: Add two matrices
* 
*/

import java.util.Scanner;

public class Exercise_8_5 {
	
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		/* Will add together each index of array Matrix A to the corresponding index of array Matrix B into a new array, Matrix C. */
		
		
		// Declare new array c.
		double [][] c = new double [3][3];
		
		
		// Loop adds matrixA[i][j] + matrixB[i][j].
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				double sum = a[row][column] + b[row][column]; // Add matrix indecies.
				c[row][column] = sum; // Store sum into corresponding index of matrix c.
			}
		}
		
		
		// Return array c
		return c;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		// Define values of matrix A and matrix B.
		double [][] matrixA = {
			{1.0, 2.0, 3.0},
			{4.0, 5.0, 6.0},
			{7.0, 8.0, 9.0},
		};
		
		double [][] matrixB = {
			{0.0, 2.0, 4.0},
			{1.0, 4.5, 2.2},
			{1.1, 4.3, 5.2},
		};
		
		
		// Call addMatrix method.
		double [][] matrixC = addMatrix(matrixA, matrixB);

		
		/* Print Matrix A + Matrix B = Matrix C. */
		
		// Print matrix A
		System.out.println("Matrix A"); 
		System.out.println(); 
		for (int row = 0; row < matrixA.length; row++) { 
			for (int column = 0; column < matrixA[row].length; column++) {
				System.out.print(matrixA[row][column] + "  "); 
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" + "); // Print plus sign
		System.out.println();
		
		
		// Print matrix B
		System.out.println("Matrix B"); 
		System.out.println(); 

		for (int row = 0; row < matrixB.length; row++) { 
			for (int column = 0; column < matrixB[row].length; column++) {
				System.out.print(matrixB[row][column] + "  "); 
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" = "); // Print equal sign
		System.out.println();
		
		
		// Print matrix C
		System.out.println("Matrix C"); 
		System.out.println(); 
		for (int row = 0; row < matrixC.length; row++) { 
			for (int column = 0; column < matrixB[row].length; column++) {
				System.out.print(matrixC[row][column] + "  "); 
			}
			System.out.println();
		}
	
	
	}
		
}

