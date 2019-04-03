package com.class14;

public class Task3 {

	/*
	 * You have a String a=“Is it saturday! Is it raining! Do we have a Java Class
	 * today?” How would you find out how many sentences are in that String?
	 */

	public static void main(String[] args) {
		
		//1)
		String a = "Is it saturday! Is it raining! Do we have a Java Class today?";

		String[] sentance = a.split("[!?]");

		System.out.print(sentance.length);

		System.out.println();

		//2)
		String b = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] other= b.split("[?]");
		
		System.out.println(other.length);
}
}

