package com.HomeWorkAndOrPractice;

import java.util.Scanner;

public class JavaHW {
	
	/*	03/02/2019
	 * 	Write a program to find largest of three double values
	 * 	Using if else 
	 * 	If provided by a user 
	 *  Numbers must be distinct
	 */	

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("What is your first double value");
		double variable = myScanner.nextDouble();

		System.out.println("What is your second double value");
		double variable2 = myScanner.nextDouble();

		System.out.println("What is your third double value");
		double variable3 = myScanner.nextDouble();

		if (variable > variable2 && variable > variable3) {
			System.out.println(variable + "  Value is the largest");
		
		} else if (variable2 > variable && variable2 > variable3) {
			System.out.println(variable2 + "  Value is the largest ");
		
		} else {
			System.out.println(variable3 + "  Value is the largest");
		}
	}
}

	/* Or you can do it like this
	 * 
	 * double num1, num2, num3;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter 3 distinct double values");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        
        if(num1>num2 && num1>num3) {
            System.out.println(num1+ " is the largest");
        }else if (num2>num1 && num2>num3) {
            System.out.println(num2+ " is the largest");
        }else if (num3>num1 && num3>num2) {
            System.out.println(num3+ " is the largest");
	 */
