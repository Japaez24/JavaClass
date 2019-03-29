package com.class9;

import java.util.Scanner;

public class Task21 {

	/*
	 * 2. Ask user to enter the item they want to buy and the price for the item.
	 * Then ask user to pay for it. Every time user enters money accumulate the
	 * amount and tell user how much is left to pay off the amount. Whenever user
	 * done with payments tell them "Thank you for shopping!"
	 */

	public static void main(String[] args) {

		int totalPayment = 0;
		int balance = 0;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is the item you want to buy");
		String item = myScanner.nextLine();

		System.out.println("How much is the item you want to buy");
		int price = myScanner.nextInt();

		do {

			System.out.println("Please enter your payment amount");
			int payment = myScanner.nextInt();

			totalPayment = totalPayment + payment;

			balance = price - totalPayment;

			System.out.println("Please pay the balance of $" + balance + " Thank you");

		} while (totalPayment != price);

		System.out.println("Thank you for your purchase");
	}

}