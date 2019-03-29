package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		
		//Changing value of variables 02-17-2019 

		String name = "John";

		String lastName = ("Smith");

		char grade = 'A';
		// char grade= 'A' : Do not make it this way to change value of variable

		System.out.println(grade); //Should print with Grade 'A' 
		
		// Use the way bellow to change value of variable
		grade = 'B';

		System.out.println(grade); // Should print with grade 'B' now because of "Stack Order"

		// Example below

		String city = "Fairfax";

		// Print value
		System.out.println(city);

		city = "New York";

		// Print updated value
		System.out.println(city); // Should Show the new city that was updated
		
		// Example
		
		System.out.println(name);
		
		name= "Jason";
				
		System.out.println(name);
		
		//name was change from John to Jason successfully 
		
		

	}

}
