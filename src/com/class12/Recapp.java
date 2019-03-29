package com.class12;

public class Recapp {

	public static void main(String[] args) {

		int[][] array = { 
				{ 1, 2, 3 }, 
				{ 10, 20, 30 }, 
				{ 100, 200, 300 } 
				};

		for (int i = 0; i < array.length; i++) {
			
			for (int a=0; a<array[i].length;a++) {
				
				System.out.print(array[i][a]+", ");
				
			}
			
			System.out.println();
		}
System.out.println("---------------------------------- 2nd"+" Advanced"+"--------------------------------------------------");
		
		for (int[] singleArray: array) {
			for(int numbers:singleArray) {
				
				System.out.print(numbers+", ");
			}
		System.out.println();
		}
	}
}
