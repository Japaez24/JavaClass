package com.class8;

public class Sum {

	public static void main(String[] args) {
		
		
		// find sum of all even numbers from 1 to 100
		
		int sum=0;
		
		for (int i = 0; i<=100 ; i+=2) {
		
			sum=sum+i;
			
			
		}
		System.out.println(sum);
	}
}
