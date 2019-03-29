package com.class11Arrays;

public class Task3 {

	// Create an array on integers and calculate the sum of all elements in an array.

	public static void main(String[] args) {
		int sum=0;
		int[] numbers = { 12, 13, 14, 15, 16, 17, 18 };

		for (int i = 0; i < numbers.length; i++) {
			sum=sum+numbers[i];
			
			
		}
		System.out.println(sum);
	}
}
