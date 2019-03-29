package com.class12;

public class StringManipulations3 {
public static void main(String[] args) {
	
	// charAT 
	
		String str= "Students";
		char character=str.charAt(4);
		System.out.println(character);
		
		for (int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("----------------------next-----------------------------------");
	// indexOf
		
		String str1="Sunday";
		
		int index=str1.indexOf("n");
		System.out.println(index);

		
	// 
		
		String str3="Today is Sunday Java class";
		
		String newString= str3.substring(8);
		System.out.println(newString);

		System.out.println(str3.substring(0, 5));

}
}