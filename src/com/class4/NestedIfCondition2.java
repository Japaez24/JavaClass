package com.class4;

public class NestedIfCondition2 {
	public static void main(String[] args) {

		// Declare variable for GPA and if the person has a diploma
		// If user has a diploma than "Congratulations"
		// If GPA is higher than 3.5 than hire person
		// Else do not hire.

		double gpa = 4.0; // This variable can change and will effect line 19
		double expectedGpa = 3.5;

		boolean hasDiploma = true;

		if (hasDiploma) { // If condition is true than it will go to line 18, if condition is false it will jump to line 24

			System.out.println("Congratulations");
			if (gpa > expectedGpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("Unfortunately we cannot hire you");
			}
		} else {

			System.out.println("Please get your degree");

		}
	}
}
