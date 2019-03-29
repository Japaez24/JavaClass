package com.class6;

import java.util.Scanner;

public class SwitchString {
	
	/*	prompt user to enter their counrty
	 * 	based on the country ----> specify favorite food
	 */
	
	public static void main(String[] args) {
	
	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("What Country are you from?");
	String country = myScanner.nextLine();
	
	String favoriteFood;
	
	switch (country) {
	
	case "USA":
		favoriteFood="Burger";
		break;
	case "Afghanistan":
		favoriteFood= "Palau";
		break;
	case "Russia":
		favoriteFood= "Pelmeni";
		break;
	case "Colombia":
		favoriteFood= "Arepas";
		break;
	case "Italy":
		favoriteFood= "Pasta";
		break;
	case "Pakistan":
		favoriteFood= "Biryani";
		break;
	default:
		favoriteFood= "Unkown";
		break;
		
	}
	System.out.println("favorite food is "+favoriteFood);
	}
}
