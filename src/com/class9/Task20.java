package com.class9;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {

		/*
		 * 1. Write a program that reads a set of (2)integers, provided by a user and
		 * then prints the sum of the even and odd integers.
		 */


		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter start point");
		int start = myScanner.nextInt();
		System.out.println("Please enter end point");
		int end = myScanner.nextInt();
		int sumEven = 0;
		int sumOdd = 0;

		if(start<end) {
			
			for (int i = start; i <= end; i++) {

				if (i % 2 == 0) {

				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		

		}
		 System.out.println("The sum of even numbers is "+sumEven);
		 System.out.println("The sun of odd numbers is "+sumOdd);


	}
}
}