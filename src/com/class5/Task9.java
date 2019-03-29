package com.class5;

import java.util.Scanner;

public class Task9 {
	
	/*	Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following:
	• short (under 5 feet)
	• medium(5 to 6 feet)
	• tall (6 feet and over)
	*/

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please state your height in inches");

		double personOne = myScanner.nextDouble();
		double heightOne = personOne / 12;

		System.out.println("Please state your friends height in inches");

		double personTwo = myScanner.nextInt();
		double heightTwo = personTwo / 12;

		if (heightOne < 5) {
			System.out.println("You are Short");

		} else if (heightOne >= 5 && heightOne < 6) {
			System.out.println("You are Medium");

		} else {
			System.out.println("You are Tall");
		}
		if (heightTwo < 5) {
			System.out.println("Your friend is Short");
		} else if (heightTwo >= 5 && heightTwo < 6) {
			System.out.println("Your friend is Medium");
		} else {
			System.out.println("Your friend is Tall");
		}
	}

}
