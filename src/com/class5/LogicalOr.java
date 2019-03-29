package com.class5;

import java.util.Scanner;

public class LogicalOr {
	public static void main(String[] args) {
		
		/*	We have seven days a week
		 * 	If days are from 1-5 ---> weekday
		 *  If days are from 6-7 ---> weekend
		 *  Otherwise, not valid
		 */
	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("write a number for day");
	
	int day;
	day=myScanner.nextInt();
	
	if (day == 1 || day == 2 || day ==3 || day == 4 || day == 5) {
		System.out.println("It is a weekday");
	
	}else if  (day == 6 || day == 7) {
		System.out.println("It is a weekend");
	
	}else {
		System.out.println("not a valid day");

	}
}
}
