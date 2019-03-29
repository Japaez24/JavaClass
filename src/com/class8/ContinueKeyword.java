package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=0; i<6; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		for (int i=0; i<5; i++) {
			
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
	
	// i want to print number from 1 to 20 but skip those that are divisible by3
		
		for(int a=1; a <= 20; a++) {
			if (a%3==0) {
				continue;
				
			}
			System.out.println(a);
			
		}
	
	
	}
}
