package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {

		//String Concatenation 02-17-2019
		
		// My name is "practice';

		String name1 = "practice";

		// System.out.print("My name is"+name1);

		// System.out.print("My name is "+name1); //remember to add the space

		// Task 02-17-2019
		// My name is John and my last name is Smith
		// I am A student
		// I live in a City of fairfax in a state of VA
		// My Phone number is ______

		String name = "John";
		String lastName = "Smith";
		char grade = 'A';
		String city = "Fairfax";
		String state = "VA";
		long phoneNumber = 5714949339L;

		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am a " + grade + " student");
		System.out.println("I live in a city of " + city + " in a state of " + state);
		System.out.println("My phone number is " + phoneNumber);
		
		

	}

}
