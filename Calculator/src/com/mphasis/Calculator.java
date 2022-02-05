package com.mphasis;

import java.util.Scanner;

public class Calculator {

	static {
		System.out.println("******************************");
	}
	static double vi = 0;

	public static void main(String[] args) {
		// stores two numbers
		while (true) {
			// Take input from the user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number-");
			System.out.println("*********************************");
			// take the inputs

			double num1 = sc.nextDouble();
			System.out.println("Enter seond number-");
			double num2 = sc.nextDouble();
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			
			System.out.println("*********************************");
			int i = sc.nextInt();

			switch (i) {
			// case to add two numbers
			case 1:

				System.out.println("Adding two numbers...");
				vi = num1 + num2;

				break;

			// case to subtract two numbers
			case 2:
				System.out.println("Substracting two numbers");
				vi = num1 - num2;

				break;

			// case to multiply two numbers
			case 3:
				System.out.println("Multiplying two numbers...");
				vi = num1 * num2;

				break;
			// case to divide two numbers
			case '4':
				System.out.println("Dividing two numbers");
				vi = num1 / num2;

				break;


			}
			// print the final result
			System.out.println("Result of " + num1 + " and " + num2 + " is " + vi);
			System.out.println("*********************************");
		}

	}
}