package com.class19;

public class ReversedString {

	/*
	 * Create a method that will take 1 parameter as a String and return reversed String. 
	 * Method should be visibly only within same package.
	 */
	
	protected static String createName(String A) {
        String createName="";
        for (int i=A.length()-1;i>=0;i--) {
            createName=createName+A.charAt(i);
        }
        return createName;
    }
public static void main(String[] args) {
        System.out.println(createName("Students"));
        
        
    }
    
    }