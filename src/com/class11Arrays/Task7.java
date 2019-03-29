package com.class11Arrays;

public class Task7 {

	public static void main(String[] args) {

		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array.
		 */

	String[][] countries= {
			{"Canada","USA","Mexico"},
			{"Colombia","Peru","Argentina","Brazil","Chile","Uruguay"},
			{"Spain","Portugal","England","France"},
			{"Japan","China","Thailand","India"}
			};
	for (int i=0; i<countries.length; i++) {
		
		for(int a=0; a<countries[i].length; a++) {
			System.out.print(countries[i][a]+" ");
			
		}
	System.out.println();
	}
	
	
	}
	

}
