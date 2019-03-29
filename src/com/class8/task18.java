package com.class8;

public class task18 {

	// Print numbers from 1 to 100

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Print numbers from 100 to 1

		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		// Print odd numbers from 1 to 20 (2ways)

		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}
		

		// Print even number from 20 to 1 (2ways)

		for (int i = 20; i >= 1; i -= 2) {
			System.out.println(i);
		}
		
		// Print even numbers between 20 and 50 (2ways)

		for (int i = 20; i <= 50; i += 2) {
			System.out.println(i);
		}
		for (int i = 20; i <= 50; i += 2) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		
		// Print odd number between 20 and 50 (2ways)
		
		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}
		for(int a=20; a<=50; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
		}
	}
}
