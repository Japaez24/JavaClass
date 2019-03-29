package com.class6;

import java.util.Scanner;

public class Task13 {

	/*
	 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
	 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
	 * should print which grade was entered by a user with explanation.
	 */

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please input your grade");
		char grade = myScanner.next().charAt(0);

		String result;

		switch (grade) {

		case ('A'):
			result = "Excellent";
			break;
		case ('B'):
			result = "Good";
			break;
		case ('C'):
			result = "Average";
			break;
		case ('D'):
			result = "Bad";
			break;
		default:
			result = "Not Acceptable";
			break;
		}
		System.out.println("The grade entered is " + grade + " making the result " + result);
	}

}
