package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	
	public static void main(String[] args) {
		
		/*  Ask user to enter city and temperature in Fahrenheit 
		 *  Your program should convert Fahrenheit to Celsius
		 *  Your program should say "the temperature in the city ___ is ___ "
		 */
		
	String cityName;
	int temp;
	
	Scanner myScanner=new Scanner(System.in);
			System.out.println("Please enter your city");
	
	cityName= myScanner.nextLine();
	
	System.out.println("Please enter temperature in Fahrenheit");
	
	temp= myScanner.nextInt();
	
	//formula (F -32) x 5/9;
	
	int convertedTemp=(temp-32)*5/9;
	
	System.out.println(convertedTemp);
	
	System.out.println("the temperature in the city "+cityName+" is "+convertedTemp+"Celsious");
	
	
	
	}

}
