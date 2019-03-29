package com.class11Arrays;

public class RetrievingAllValues {

	public static void main(String[] args) {

		int[][] num = { 
				{ 11, 12, 13, 14 }, //4 
				{ 21, 22, 23 }, 	//3
				{ 31, 32, 33, 34 } 	//4
				};

		int rows = num.length;
		System.out.println(rows); // will print the number of rows

		int column = num[2].length;
		System.out.println(column); // will print the number of columns

		System.out.println("-------------------- start of for ------------------------");
		
		for (int row = 0; row < num.length; row++) {

			for (int col = 0; col < num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
	}
}
