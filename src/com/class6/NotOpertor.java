package com.class6;

public class NotOpertor {

	/*	
	 * 
	 */

	public static void main(String[] args) {

		boolean a = true;

		// Boolean will print with true
		System.out.println("the value of boolean variable is " + a);

		// Boolean will print falso no because of the not operator
		a = !true;
		System.out.println("the value of boolean variable is " + a);

		// If it is not snowing ----> i will come to the class
		// Otherwise, i will stay at home
		
		boolean snow=true;
		
		if (!snow) {
			System.out.println("i will come to the class"); 
			// Will not print because the value of snow is true, but your saying if its not(!) true than print
		
		
		int x=10;
		int y=20;
		
		if (x>y) {
			System.out.println("x is larger than y"); // will not print because statment is false
		}
		if (!(x>y)) {
			System.out.println("hello");// will print because of not operator 
		}
		}
		}
}
