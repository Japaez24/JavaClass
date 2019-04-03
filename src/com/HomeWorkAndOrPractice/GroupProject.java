package com.HomeWorkAndOrPractice;

public class GroupProject {

	public static void main(String[] args) {

		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?

		int x = 10;
		int y = 20;

		System.out.println("x is " + x);
		System.out.println("y is " + y);

		x = x + y;	//30
		y = x - y;	// 30=30-20
		x = x - y;	// 30=30-10 (variable y now holds the value of 10)

		System.out.println("x is now " + x);
		System.out.println("y is now " + y);

		
		String str = "Group";
		String str1 = "testMasters";

		System.out.println();
		
		System.out.println("Frist String is " + str);
		System.out.println("Second String is " + str1);

		str = str + str1; //GrouptestMasters
		str1 = str.substring(0, str.length() - str1.length());  //testMasters
		str = str.substring(str1.length()); // Group

		System.out.println("Frist String is now " + str);
		System.out.println("Second String is now " + str1);
		
		str=str+str1;
        str1=str.replaceAll(str1,"");
        str=str.replaceAll(str1, "");
        
        System.out.println();
        System.out.println("Using replace");
        System.out.println("Frist String is now " + str);
		System.out.println("Second String is now " + str1);
		

	}
}