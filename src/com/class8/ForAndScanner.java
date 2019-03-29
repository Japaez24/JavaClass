package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {

		// Prompt user to enter 2 int and compare
		// at the end print largest

		Scanner myScanner = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println("Please enter two numbers");
			int num1 = myScanner.nextInt();
			int num2 = myScanner.nextInt();

			int largest=0;

			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println("number are equal");
			}
			System.out.println("the largest of two numbers is " + largest);
		}

	}
}
