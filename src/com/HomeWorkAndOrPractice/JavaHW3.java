package com.HomeWorkAndOrPractice;

import java.util.Scanner;

public class JavaHW3 {

	/*
	 * 03/03/2019 HomeWork: Using scanner class create calculator. Allow user to
	 * enter numbers and operator(+,-,*,/). Based on operator provide the result to
	 * user.
	 */

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter your first number");
		double num1 = myScanner.nextDouble();

		System.out.println("Please enter the operator");
		char operator = myScanner.next().charAt(0);

		System.out.println("Please enter your last number");
		double num2 = myScanner.nextDouble();

		double answer;
		
		switch (operator) {

		case ('+'):
			answer = num1 + num2;
			break;
		case ('-'):
			answer = num1 - num2;
			break;
		case ('*'):
			answer = num1 * num2;
			break;
		case ('/'):
			answer = num1 / num2;
			break;
		default:
			answer= 0;
		}
		System.out.println("the result is "+answer);
	}
}
