package com.class5;

import java.util.Scanner;

public class takingOutSysO {
	
	/* Write a program to ask user to enter daily sales amount
	 * Based on the sales range commission will be different;
	 * Ex: Sale is <100 than commission is =2%
	 * sale is <200 than commission is =5%
	 */
	public static void main(String[] args) {
		
	 Scanner  scan;
	 int sales;
	 int commission;
	 
	 scan = new Scanner(System.in);
	 System.out.println("Please enter sales amount");
	 sales= scan.nextInt();
	 
	 if (sales >0 && sales < 100) {
		 commission=2;
	 }else if (sales < 200 ){
		 commission=5;
	 }
	
	}
	
	
	
}
