package com.class4;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
	// You are DMV representative and you need to ask customer their age
	// If they are 18 and older you will issue a driver license to them
	// Otherwise, you will offer them to get a learners permit.
	
	int age;
	
	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("Please state your age");
	
	age = myScanner.nextInt();
	
	int limit=18;
	
	if (age >= limit) {
		System.out.println("Because you are "+limit+" or older, you will recieve a drivers license today");
		
	} else { 
		System.out.println("Unfortunalty because you are "+age+" you will recieve a lerners permit");
	}
	
		
	}

}
