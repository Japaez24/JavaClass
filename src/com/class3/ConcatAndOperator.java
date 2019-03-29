package com.class3;

public class ConcatAndOperator {

	public static void main(String[] args) {
		
		// Feb 23,2019
		// Reminder when writing code the program will execute from top to bottom and left to right unless the user commands it otherwise !

		int x = 10;
		int y=20;
		
		String a ="Hello";
		String b = "Bye";

		// Because of concatenation the answer is 10+20= 30 + Hello= 30Hello + Bye= 30HelloBye
		//                                               ^At this step it converts to a string
		System.out.println(x+y+a+b);
		
		System.out.println(x+a+y+b);
		
		System.out.println(x+a+b+y);
		
		// Because of concatenation the answer is Hello+Bye= HelloBye +10= HelloBye10 + 20= HelloBye1020
		//                                                  ^At this step it converts to a string
		System.out.println(a+b+x+y);
		
		//Now because of the () it will perform the math first. (PEMDAS)
		System.out.println(a+b+(x+y));
		
		
		//Math (=-*/) Math(9538) equals Math
		//Math (=-*/) char(ab%d) equals string
		
		//_____________________________________________________________________________________________________________________________________________________
		
		
		// Modulus operator
		
		int g=10;
		int h=3;
		
		int div=g/h;
		
		System.out.println(div);
		// Programming is strict... int will not store decimal point, the answer is 3
		
		
		//modulus operator
		
		int mod=g%h; 
		 
		System.out.println(mod);
		//modulus operator is reminder of the number that was left over
		
		int q=23;
		int w=11;
		
		System.out.println(q%w);
		//Modulus operator is 1( 1 is the number left over)
		
		int r=47;
		int t=10;
		
		System.out.println(r%t);
		//Modulus operator is 7 (10 goes into 40 4 times) (7 is left over)
		
		//_____________________________________________________________________________________________________________________________________________________________
		
		
		//Pemdas
		//Parentheses, Exponents, Multiplication/Division, Addition/Subtraction
		
		int e= -5 + 4*6;
		System.out.println(e); // Pemdas makes the answer 19
		
		int l=(22+9) %7;
		System.out.println(l);// Answer is 3
		
		int o=20 + -3*5 / 8;
		System.out.println(o); // Answer is 19
		
		int s= 5 + 15/ 3 * 2 - 8 %3;
		System.out.println(s); // Answer is 13
		
		
		
	}

}
