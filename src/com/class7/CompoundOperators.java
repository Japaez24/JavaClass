package com.class7;

public class CompoundOperators {
	public static void main(String[] args) {

		int a = 10;
		a = a + 10;

		System.out.println(a); // Output will be 20

		int b = 100;

		b = b + 100;

		System.out.println(b); // Output will be 200

		int c = 100;

		c += 100; // c=c+100;

		System.out.println(c); // Output will be 200

		c += 35; // c(200)+c(35)=235
		System.out.println(c); // Output will be 235

		c += 50;

		System.out.println(c); // Output will be 285
		
		int d = 30;
		
		d-= 10;
		
		System.out.println(d); // Output will be 20
		
		d+= 50;
		
		System.out.println(d); // 70
		
		d/=5;
		
		System.out.println(d); // 14
		
		d%=4; // 4*3= 12 which means remainder 2
		
		System.out.println(d); // 2 because the modulus operator(remainder) is 2 
	}

}
