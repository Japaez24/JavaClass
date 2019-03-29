package com.class11Arrays;

public class LargestArray2 {

	public static void main(String[] args) {
		
		
		int[] numbers= {12,14,15,16,40,20};
		int largest= numbers[0];
		
		
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]> largest) {
				largest=numbers[i];
			}
		}
		System.out.println(largest);
	}
}
