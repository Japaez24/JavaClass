package com.class6;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("enter number 1-7 for day");
		int day = myScanner.nextInt();
		String dayName;

		// only works when talking about == never when using relational operators (>, <, >=, <=) or Logical operators ( &&, ||, !)
		switch (day) {

		case 1:
			dayName = "monday";
			break;
		case 2:
			dayName = "tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "invalid";

		}
		System.out.println("Today is " + dayName);
	}
}
