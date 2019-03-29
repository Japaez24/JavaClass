package com.class7;

import java.util.Scanner;

public class Task17 {

	//Prompt user to ask the name 3 times and print "You are doing great _______" 
	
	
	public static void main(String[] args) {
	
	
	Scanner myScanner = new Scanner(System.in);
	
	int a=1;
	
	while(a <= 3) {
		System.out.println("Please enter your name ");
		String name= myScanner.nextLine();
		
		System.out.println("You are doing great "+name);
		
		a++;
		
	}
	}
}
