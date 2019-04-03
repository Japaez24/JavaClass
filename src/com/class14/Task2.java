package com.class14;

public class Task2 {

	/*
	 * Create a String that should be combination of letters, numbers and special
	 * characters. Find out how many alpha characters are there in the String.
	 */

	public static void main(String[] args) {
		
	
	String str= "the Redskins play so %$#^&*! well that we have made it to the playoffs 3 times in the last 10 years";
	
	String newStr= str.replaceAll("[^A-Za-z]", "");
	System.out.println(newStr.length());
	
	}		
	
	
}
