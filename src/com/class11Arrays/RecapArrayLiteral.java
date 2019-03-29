package com.class11Arrays;

public class RecapArrayLiteral {

	// Create an array using literal
	
	public static void main(String[] args) {
		
							 // 0         1      2        3        4          means length is 5
	String [] studentNames = {"Shaban", "Bilal","Mehemet","Samir","Frank"};
	
	for(int i=0; i<=studentNames.length-1; i++) {
		System.out.println(studentNames[i]);
	}
		
	}
}
