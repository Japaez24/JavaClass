package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {

		// Create a Java program and name it Temperature Check. Create variable to store temperature
		// Your program should check if temperature is bellow 32 than it should print
		// "Water will freeze with temperature __-"
		// Otherwise "Water will Not freeze with temperature ____ "
		
		int a=32;
		int b=33;
		
		if (a <= b) {
		
		System.out.println("water will freeze temperature "+a);
		
	} else { 
		System.out.println("Water will NOT freeze with temperature "+a);
		
	}
	// Or this way to cover your basis (Preferred way below)
		
		
		int f=32; //This variable can change and the answer should change depending on the condition
		
		if (f <= 32) {
		
		System.out.println("water will freeze temperature "+a);
		
	} else { 
		System.out.println("Water will NOT freeze with temperature "+a);

		
	}
	}
}
