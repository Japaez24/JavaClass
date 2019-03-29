package com.class7;

import java.util.Scanner;

public class Task14 {
	/*
	 * 1. Declare variable and increase by 100 using shorthand operator
	 * 
	 * 2. Declare variable and decrease by 67 using shorthand operator
	 * 
	 * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using
	 * shorthand operator each person should get an equal piece of cake
	 * 
	 * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people using
	 * shorthand operator found out how many pieces of cake left after it was
	 * distributed equally among 7 people
	 */

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		// Task 1
		System.out.println("Assign a value");
		int a = myScanner.nextInt();

		a += 100;

		System.out.println("Variable is now" + a);

		// Task 2
		System.out.println("Assign a value");
		int b = myScanner.nextInt();

		b -= 67;

		System.out.println("Variable is now " + b);

		myScanner.close();

		// Task 3

		int cakePiece = 11;

		cakePiece /= 4;

		System.out.println("Everyone should get " + cakePiece + " piece");

		// Task 4

		int cakePieces = 25;

		cakePieces %= 7;

		System.out.println("Their were " + cakePieces + " leftover");
	}
}
