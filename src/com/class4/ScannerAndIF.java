package com.class4;

import java.util.Scanner;

public class ScannerAndIF {
	
	public static void main(String[] args) {
	
	// Take 2 numbers from a user and compare those  numbers
		  
	int num1, num2;
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Please eneter first number");
	
	num1= scan.nextInt();
	
	System.out.println("please enter second number");
	
	num2= scan.nextInt();
	
	System.out.println(num1);
	System.out.println(num2);
		
	if (num1 > num2) {
		System.out.println(num1+" is larger than "+num2);
		
	} else if (num1 == num2) {
		System.out.println(num1+" is equal to "+num2);
		
	} else {
		System.out.println(num1+" is smaller than"+num2);
	
	
	}

	}

}
