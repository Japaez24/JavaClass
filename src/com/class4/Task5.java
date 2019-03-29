package com.class4;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

	// You are loan specialist and need to ask user what is the amount of loan needed. 
	// if loan is less than 200,000 than you would lend the money otherwise you would reject the client
		
	int loanAmount;
	
	Scanner myScanner = new Scanner(System.in);
	
		System.out.println("Please enter the amount of loan you need");
	
	loanAmount= myScanner.nextInt();
	
	int max=200001;
	
	if (loanAmount >= max ) {
		System.out.println("Unfortunatly your loan request of "+loanAmount+" has been rejected");
	
	} else {
		System.out.println("Your loan request of "+loanAmount+" Has been approved");
	
	
	}
	
	}

}
