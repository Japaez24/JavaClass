package com.class3;

public class MultipleConditions {

	public static void main(String[] args ) {
		
		// Create a Java program and declare int variable that will hold a day.
		// Based on the value of the variable your program should print
		// The name of the day 
		
		int day=5;// When change to 1 it will answer "Monday", 2 will be "Tuesday" etc...
				
		if (day ==1) {
			System.out.println("Monday");
			
		// If you need multiple conditions for your program
		} else if (day == 2) {
			
			System.out.println("Tuesday");
		} else if (day == 3) {
			
			System.out.println("Wendesday");
		} else if (day == 4) {
			
			System.out.println("Thursday");
		} else if (day == 5) {
			
			System.out.println("Friday");
		} else if (day == 6) {
			
			System.out.println("Saturday");
		} else if (day == 7) {
			
			System.out.println("Sunday");
			
		// Use this when your parameters have been met and need to have a basis for other variables (past number 7 in this case)
		}else {
			
			System.out.println("error");// Can put what ever you need inside the "" 
		
		} //Curly brace is for main method
		
	} // Curly brace is for class
	
} // Curly brace is for package 
