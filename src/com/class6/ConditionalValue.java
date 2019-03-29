package com.class6;

import java.util.Scanner;

public class ConditionalValue {

	/* use a variable instead of sysout
	 * Same process as "JavaHW2" just a new better way
	 */

	public static void main(String[] args) {

		int num1, num2, num3;
		int largest;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please put 3 distinct variables");
		num1 = myScanner.nextInt();
		num2 = myScanner.nextInt();
		num3 = myScanner.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		} else {
			if (num2 > num3) {
				largest = num2;
			} else {
				largest = num3;
			}
			System.out.println(largest + " is the largest value");
		}
	}
}