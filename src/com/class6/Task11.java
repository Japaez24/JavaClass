package com.class6;

import java.util.Scanner;

public class Task11 {

	/*
	 * Write a program that prints out if it is good weather to go for any activity
	 * or not If the temperature is between 40 degrees and 80 degrees inclusive & no
	 * rain--> we will go for hiking otherwise--> we will not go hiking If
	 * temperature is between 25 and 40 inclusive & snowing -->going snow boarding
	 * otherwise we are not going snow boarding it if temperature is more than 80 &
	 * sunny--> go to the beach otherwise --> not go to the beach
	 */

	public static void main(String[] args) {

		boolean rain, snow, sunny;
		int temp;
		String activity;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("What is the Temperature");
		temp = myScanner.nextInt();

		if (temp >= 40 && temp < 80) {

			System.out.println("is it raining");
			rain = myScanner.nextBoolean();

			if (rain) {
				activity = "We will watch a movie";
			} else {
				activity = "we will go for a hike";
			}
		} else if (temp < 40 && temp >= 25) {

			System.out.println("is it snowing");
			snow = myScanner.nextBoolean();

			if (snow) {
				activity = "we are going snowboarding";
			} else {
				activity = "we are not going snowboarding";
			}
		} else if (temp >= 80) {

			System.out.println("is it sunny");
			sunny = myScanner.nextBoolean();

			if (sunny) {
				activity = "we go to the beach";
			} else {
				activity = "we will stay home and practice coding";
			}

		} else {

			activity = "we are staying home to do more coding";

		}
		System.out.println("the temperature is " + temp + " and " + activity);
	}
}
