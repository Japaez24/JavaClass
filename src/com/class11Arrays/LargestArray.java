package com.class11Arrays;

public class LargestArray {
	
	// create an array of integers and find the largest numbers
	
	public static void main(String[] args) {
		
		int largest=0;
		int[] numbers= {12,14,15,16,30,20};
		
		for(int number: numbers) {
			 
			if (number> largest) {
				 largest=number;
			}
		}
			System.out.println("the Largest is "+largest);
	}
}

