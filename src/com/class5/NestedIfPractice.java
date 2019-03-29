package com.class5;

public class NestedIfPractice {
public static void main(String [] args ) {
	/*	if user has a credit card
	 * 	Check what is the balance if the balance is ore than 100---> pay off
	 * Else " you are good"
	 */

boolean creditCard= true;
int balance= 1000;

	if (creditCard) {
		System.out.println("lets check the balance");
		if (balance > 1000) {
			System.out.println("pay off now");
		
		} else  {
				System.out.println("You are safe");
		}

	} else {
	System.out.println("do you want to apply");

}
}
}
