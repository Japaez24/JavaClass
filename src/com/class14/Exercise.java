package com.class14;

public class Exercise {

	// Reverse a String without using a reverse function

	public static void main(String[] args) {
	
	
	String original="Today is Java Class";
	String reverse="";
	
	char[] array=original.toCharArray();
	for(int i=array.length-1; i>=0; i-- ) {
		
		reverse=reverse+array[i];
	}
	
	System.out.println(original+" -In reverse is- "+reverse);
	
	
	// substring
	String reverseString="";
	
    for(int i = original.length(); i>0; i--) {
        reverseString= reverseString+original.substring(i-1,i);
		
	}
    System.out.println(reverseString);
	
}

}