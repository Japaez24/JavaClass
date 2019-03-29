package com.class9;

public class NestedLoops1 {

	public static void main(String[] args) {

	/*for (int i = 0; i <= 5; i++) {

		System.out.print(i);
	}
	
	System.out.println();
	for (int i = 0; i <= 5; i++) {

		System.out.print(i);
	}
	
	System.out.println();
	for (int i = 0; i <= 5; i++) {

		System.out.print(i);
	}
}
*/

	// I want to print pattern
	// 12345 ----> 4rows & 5 Columns
		
		for (int i = 1; i <= 5; i++) {

			for (int y = 1; y < 10; y++) {

				System.out.print(y);
			}
			System.out.println();
		}
		

	}
}