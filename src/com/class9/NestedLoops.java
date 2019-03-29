package com.class9;

public class NestedLoops {
// One loop inside another loop

	public static void main(String[] args) {

		// This is the outer loop
		for (int i = 0; i < 3; i++) {

			System.out.println(i + " I am Outer loop-------<"); // If you print your outer loop here it will print before the inner loop

			// This is the inner loop
			for (int y = 0; y < 3; y++) {
				System.out.println(y + " I am Inner loop");

			}

			// System.out.println(i+" I am Outer loop-------<"); If you print your outer loop here too and it will print after the inner loop
		}

	}
}
