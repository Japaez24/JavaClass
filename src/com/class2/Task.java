package com.class2;

public class Task {

	public static void main(String[] args) {

		// Task

		// write a java program to add, subtract, multiply, divide 2 double values.your
		// program should say.
		// "The __ of 2 numbers __ and __ is equal to ___ "

		double c = 4.0;
		double d = 2.0;

		double sum = c + d;
		double sub = c - d;
		double mult = c * d;
		double div = c / d;

		System.out.println("The addition of two numbers " + c + " and " + d + "is equal to " + (c + d)); // For future
																											// reference
																											// this is
																											// another
																											// way to
																											// write
																											// with out
																											// having to
																											// make a
																											// new class
		System.out.println("the subtraction of two numbers " + c + "and " + d + "is equal to " + sub);
		System.out.println("The multiplication of two numbers " + c + "and" + d + "is equal to " + mult);
		System.out.println("the division of two numbers " + c + "and " + d + "is equal to" + div);

	}

}
