package com.class12;

public class StringMAnipulations2 {

		public static void main(String[] args) {
			
			// contains() -----> Checks a specific value in string
			
			String str="Good morning, students";
			boolean contains= str.contains("students");
			System.out.println(contains);
			
			String present= "Welcome, Jeisson";
			boolean flag=present.contains("Welcome,");
			System.out.println(flag);
		
			// startsWith() / or endsWith()
			
			String str1="syntax";
			
			boolean start= str1.startsWith("s");
			
			System.out.println(str1.endsWith("x"));
		
			//  Empty
			
			String str2="Hello";
			boolean isEmpty= str2.isEmpty();
			
			// concatinat
			
			String str3="Hello ";
			String str4="Ali! ";
			
			System.out.println(str3+str4);
			System.out.println(str3.concat(str4));
			
			// 
			String expected="You may qualify for a multi-policy discount";
			String actual=" You may qualify for a multi-policy discount      ";
			
			actual= actual.trim();
			System.out.println(expected.equals(actual));
			
			
			
			
			
		}
}
