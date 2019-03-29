package com.class4;

import java.util.Scanner;

public class ScannerClass_String {
	
	public static void main(String[] args) {
		
	// ask user for the name and print food morning ____
	
	Scanner input= new Scanner(System.in);
	//^must start with this whole method when using scanner
	
	System.out.println("Please enter your name");
	
	String name=input.nextLine();
					 //^remember to hover and enter 
	
	System.out.println("Good morning "+name);
									//^add concatenation
	
	// for scanner and string use.... ".equals()" 
	
	}
}
