package com.class11Arrays;

public class Task6 {

	
	public static void main(String[] args) {
		
		/*
		 * Create an array of cars : american, german, korean, italian. Then retrieve all values from that array
		 */
		
		String[][] cars= {
				{"Ford","Chevy","Dodge"},
				{"BMW","Mercedes","Audi","Volkswagon"},
				{"KIA","Hyundai"},
				{"Ferrari","Lambo","Alfa Romeo"}
		};
		
		for(int i=0; i<cars.length; i++) {
			
			for(int a=0; a<cars[i].length; a++) {
				
				System.out.print(cars[i][a]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
