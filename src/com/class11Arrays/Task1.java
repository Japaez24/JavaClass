package com.class11Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars= {"Ferrari","Lamborghini","Tesla","Bugatti","Koenigsegg","Lykon"};
		
		for(int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("--------------------- 2nd--------------------------");
		
		for (String print: cars) {
			System.out.println(print);
		}
	}
}
