package com.class13;

public class Task2 {

	/*
	 * Create a String and if the String is not empty perform the following: if the
	 * String has an odd number of characters and has 3 or more characters, print
	 * the character in the middle of the String
	 */

	public static void main(String[] args) {

		String created = "Syntax1";
		if (!created.isEmpty()) {
			if (created.length() % 2 != 0) {
				if(created.length()>3) {
				System.out.println(created.charAt(created.length()/2));
			}
		}
		}
	}
}
