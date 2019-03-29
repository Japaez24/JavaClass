package com.class12;

public class Task1 {

	/*
	 * Create a grocery list: fruits ,veggies, dairy 
	 * retrieve all values using two differet loops
	 */

	public static void main(String[] args) {
		
		String[][] groceries= {
				{"Strawberry","Mangos","Pinapple"},
				{"Esparagus","Brocolli","Kale"},
				{"Milk","Cheese","Yogurt","Butter"}
				};
		
	for (int i = 0; i< groceries.length; i++) {
		
		for(int a=0; a<groceries[i].length; a++) {
			System.out.print(groceries[i][a]+" ");
		}
		
		System.out.println();
	}
	System.out.println("-----------------------------2nd------------------------");
	for (String[] grocery: groceries) {
		
		for(String list:grocery) {
			System.out.print(list+" ");
		}
		System.out.println();
	}

	}
}
