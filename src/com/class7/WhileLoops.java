package com.class7;

public class WhileLoops {
	public static void main(String[] args) {

		int a = 1;

		while (a < 10) {
			System.out.println("Good Morning");
			a++;

		}

		int b = 1;

		while (b <= 5) {
			System.out.println("I am inside of while loop " + b);
			b++;
		}

		System.out.println("I am outside of while loop");

		// I want to print values from 10 to 20 inclusive;

		int z = 10;

		while (z <= 20) {
			System.out.println(z);
			z++;
		// i want to print values from 1 to 20 in only 1 line and add space	
		int q=1;
		
		while (q <= 20 ) {
			System.out.print(q+" ");
			q++;
		}
		
		System.out.println("                                                              ");
			
		// I want to print values from 10 to 1;
		
		int e=10;
		
		while (e >= 1 ) {
			System.out.println(e);
			e--;
		}
		}
	}
}
