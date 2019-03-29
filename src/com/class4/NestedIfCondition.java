package com.class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		
	// Write a program to check work eligibiltiy 
	// If user is younger than <16 than user is not allowed to work
	// Otherwise, you are allowed to work
	// if user is younger than 64 than he can work
	// otherwise, enjoy your life 
		
	int age=100;
	int eligibleAge=16;
	int retiredAge=64;
	
	if (age < eligibleAge) {
		System.out.println("You are too young to work");
		
		
	} else {
		System.out.println("leagaly you are eligible to work");
		
		if (age < retiredAge) {
			System.out.println("Go to work");
		} else {
			System.out.println("However, please enjoy your life, You do not need to work");
		}
	
	
	}
		
	}
}
