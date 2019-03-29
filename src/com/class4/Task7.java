package com.class4;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
	
	//Tried to use an extra step= Scanner aswell*** 
		
	// Create a Java program and store variables to store mortgage price. 
	// First program should check if rate is higher than 4.5 user will not buy a house
	// Otherwise, user will consider buying
	// Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan
	// Otherwise, user will pay cash.
	
	double mortgageRate;
	double expectedRate= 4.5;
	int mortgagePrice; 
		
	Scanner myScanner= new Scanner(System.in);
	
	System.out.println("Please put your rate");
	mortgageRate= myScanner.nextDouble();
	
	System.out.println("Please put your mortgage price");
	mortgagePrice= myScanner.nextInt();
	
	if (mortgageRate > expectedRate) {
		System.out.println("User will not buy a house");
	
	} else { 
		System.out.println("User will consider buying a house");
		
		if (mortgagePrice > 200000) {
			System.out.println("The user will take a loan");
		} else {
			System.out.println("user will pay cash");
		}
	}
}

}
