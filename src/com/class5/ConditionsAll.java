package com.class5;

import java.util.Scanner;

public class ConditionsAll {
	
	/*	Ask user to enter price
	 * 	And boolean value for sale
	 * 	Based on the sale we will check the price
	 * 	if price <20, we apply discount 20 & and give final price
	 * 	if price <20 but <100, we apply discount of 30 % and give final price
	 * 	if price >100 but <500, we apply discount of 50% and give fial price 
	 */

	public static void main(String[] args) {
		
		Scanner myScanner;
		boolean sale;
		int price;
		int discount;
		double finalPrice;
		
		myScanner = new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=myScanner.nextBoolean();
				
		if (sale) {
		System.out.println("Please enter price of the item");
		price =myScanner.nextInt();	
		
		System.out.println("lets check all discounts");
		if (price < 20) {
				discount=20;
				finalPrice=price-(price*0.2);
		}else if (price <= 20 && price <100) {
				discount= 30;
				finalPrice=price-(price*0.3);
		}else if (price <= 100 && price <500) {
				discount= 50;
				finalPrice=price-(price*0.5);
		}else {
				discount=75;
				finalPrice=price-(price*0.75);
				
	
			}
		
		System.out.println("Final price is "+finalPrice);
		}else {
			System.out.println("Not intrested");
		}
	
	}
}
