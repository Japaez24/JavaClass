package com.class11Arrays;

public class multdemensionalarray2 {

	public static void main(String[] args) {
		
		// using { curly brace
		
	
	int[][] a= {
			{12,13,14,14},
			{1,2,3,4},
			{5,10,15,20},
			{100,200,300,400}, // please print 300
			};
	
		System.out.println(a[3][2]);
	
	

	
	String[][] name= {
			{"Jeisson","Ali","Tayyab","Yessica"},
			{"Goku","Vegita","Piccalo","Broly"},
			};
		
	System.out.println(name[1][0]);
		
}
}