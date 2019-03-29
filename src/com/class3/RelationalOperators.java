package com.class3;

public class RelationalOperators {
	
	public static void main(String [] args) {
		
	int a=19;
	int b=5;
	
	boolean result= a > b;
	
	//Boolean will result in true
	System.out.println(result);
	
	boolean result1= a == b;
	
	//boolean will result in false
	System.out.println(result1);
	
	//when would you use relationalOperators
	//implement them when you need to make a "Condition"
	
	//Compare two numbers and if a is a larger than b --> print
	
	
	// if the word changes color than its a reserve keyword
	
	
	 if (a>b) {
	        //^When you need to write code add a curly brace	
		
		System.out.println("a is larger than b"); 
		// answer is "a is larger than b"
	
		
		a=50;// changed variable
	
		System.out.println("a is larger than b");
		//The answer will be "False now"
	} else {
		
		a=150;// changed variable
		
		System.out.println("b is larger than a");
		// answer is "a is larger than b"
		
		//______________________________________________________________________________
		
	// Depending on the "Condition"	
		
	}
	 
	double shoesPrice= 30.99;
	double originalPrice=31.99;
	
	if (shoesPrice <= originalPrice) {
		System.out.println("Than i am buying those shoes");
	
	} else {
		System.out.println("Than i am Not buying those shoes");
		
		// answer is "than i am buying those shoes"
		
	
	}
	double shoesPrice1=35.99;
	double originalPrice1=31.99;
	
	if (shoesPrice1 <= originalPrice1) {
		          //^ This is a "Relational & Equality operators" (< > <+ >+ ++ !+)     
		
		System.out.println("Than i am buying those shoes");
	
	} else {
		System.out.println("Than i am Not buying those shoes");
	
		// answer is "Than i am NOT buying those shoes"
	
	}	
//  ^ Once this curly brace is placed it will end the sequence
	
	System.out.println("I am a continous code");
	
	// ^This code will be on its own because now its a new sequence meaning it will print what ever is writen "" will print on its own

	}
}
	

