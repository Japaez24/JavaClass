package com.class4;

import java.util.Scanner;

public class ScannerClassInt {

	public static void main(String[] args) {

	//take a number from a user and print that number
		
	int num=22;
		
	Scanner scan=new Scanner(System.in); //When you get the error just hover over the red (X) and press import than hover over scanner and hit enter
				    //^ this is where you hover and hit enter 																 //^Scanner(System.in)
	
	System.out.println("please enter any number");
	
	int myNumber=scan.nextInt();
			   //^This is stating that any number that the "User" enters will automatically be introduced into "myNumber"
			   // User input will be added in the console tab bellow
	
	
	System.out.println("the number you entered is "+myNumber);
	
	
	
	}
}
