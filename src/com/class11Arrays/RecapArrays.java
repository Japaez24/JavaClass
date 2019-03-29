package com.class11Arrays;

public class RecapArrays {

	// lets create an array of names that will hold 5 elements and retrieve all values from it
	public static void main(String[] args) {
	
	String[] names= new String[5]; // the [5] is considered the element
	
	names[0]= "Asel"; // index will always start from 0
	names[1]= "Awet";
	names[2]= "Arif";
	names[3]= "Weqas";
	names[4]= "Dzmitri";
	// names [5]= "Shiva";  Will get runtime exception when trying to access it	
	
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	
	}
	
}
