package com.class4;

import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
	/*  Write a program to ask user to enter numbers of worked years and annual salary
	 *  If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not
	 *  Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
	 */
		
	int workedYears;
	int annualSalary;
	
	Scanner myScanner= new Scanner(System.in);
	
	System.out.println("Please provide the number of worked years");
	workedYears = myScanner.nextInt();
	
	System.out.println("Please provide annuel salary");
	annualSalary= myScanner.nextInt();
	
	if (workedYears >= 5) {
		System.out.println("User is eligible for the bonus");
		if (annualSalary >= 50000) {
			System.out.println("Bonus is 5000");
			
		} else {
			System.out.println("Bonus is 3000");
		}
		
		
	} else { 
		System.out.println("User is not eligible for the bonus");
	}
	
	
		
	}
}
