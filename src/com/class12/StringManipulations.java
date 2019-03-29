package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		// Length function/ or method- returns number of character in the String
		
		String str="Syntax";  // 6
		
		int lengthOfString= str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies"; //19
		
		int lengthOf2String= str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, students!"; //18
		System.out.println(str2.length());
		
		// how to change the case  of a String
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
	
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
	
		// This method compares 2 Strings, if strings are equal---> true, else it will be false
		
		String str4="Hello";
		String str5="hello";
		
		boolean equaltiy= str4.equals(str5);
		System.out.println(equaltiy);
	
		// This method compares 2 Strings but ignores case
		
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
	
		
		
	}
	
}
