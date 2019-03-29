package com.HomeWorkAndOrPractice;

import java.util.Scanner;

public class JavaHW2 {

	/* 03/02/2019
	 * Program to find largest number among three numbers Using nested if Provided
	 * by a user Numbers must be distinct
	 */

	public static void main(String[] args) {

		Scanner myScanner;
		int value1;
		int value2;
		int value3;

		myScanner = new Scanner(System.in);
		System.out.println("What is your first value");
		value1 = myScanner.nextInt();

		System.out.println("What is your second value");
		value2 = myScanner.nextInt();

		System.out.println("What is your Third value");
		value3 = myScanner.nextInt();

		if (value1 > value2) {
			if (value1 > value3) {
				System.out.println(value1 + " Is the largest");
			} else {
			}
		} else if (value2 > value3) {
			if (value2 > value1) {
				System.out.println(value2 + " Is the largest");
			} else {

			}
		} else if (value3 > value1) {
			if (value3 > value2) {
				System.out.println(value3 + " Is the largest");
			} else {
			}
		} else {
		
		
		}
		
	}
}
 /* Or else do it like this
  * 
  * 
  */
