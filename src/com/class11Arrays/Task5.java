package com.class11Arrays;

public class Task5 {

	/*
	 * Create a 2D array that first row will contain 4 names and second row will
	 * contain grades. Then you program should print name of the students that has
	 * as an A and B grade
	 */

	public static void main(String[] args) {
		
		String[][] name= {
				{"Jeisson","Ali","Yessica","Tayyab"},
				{"A","B","C","F"},
		};
	
		System.out.println(name[0][2]+" has a "+name[1][0]);
		System.out.println(name[0][1]+" has a "+name[1][1]);
	
	}
	
}
