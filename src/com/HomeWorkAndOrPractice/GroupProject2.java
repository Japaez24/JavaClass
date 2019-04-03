package com.HomeWorkAndOrPractice;

public class GroupProject2 {

	// 3. Find out how many alpha characters present in a string?
	
	public static void main(String[] args) {
		
	
	String str2 = "We must find out how many alplha characters are present";

	String newStr = str2.replaceAll("[^A-Za-z]", "");
	System.out.println(newStr.length());
}
}

