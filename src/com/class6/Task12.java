package com.class6;

import java.util.Scanner;

public class Task12 {

	/*
	 * Ask User to enter their country and capture it Once values are captured print
	 * which languages user speaks
	 */

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("What Country are you from?");
		String country = myScanner.nextLine();

		String language;

		switch (country) {

		case "USA":
			language = "English";
			break;
		case "Colombia":
			language = "Spanish";
			break;
		case "Pakistan":
			language = "Urdu";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Mexico":
			language = "Spanish";
			break;
		default:
			language = " results are inconclusive";
			break;
		}
		System.out.println("In " + country + " they speak " + language);
	}
}