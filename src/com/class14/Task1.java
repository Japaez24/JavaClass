package com.class14;

public class Task1 {

	/*
	 * Create a String that will hold a sentence. Write a program to get a new
	 * String without any spaces.
	 */

	public static void main(String[] args) {

		// 1)
		String str = "Tayyab gets bullied by Ali because he deserves it";

		String[] sentance = str.split(" ");
		for (int i = 0; i < sentance.length; i++)
			System.out.print(sentance[i]);

		System.out.println(" ");

		// 2)
		String newStr = str.replaceAll(" ", "");
		System.out.println(newStr);
	}
}