package com.class15;

public class Car {
	
	String make, model, color;
	int door, wheels;
	
	 public static void main(String[] args) {
		
		 // ClassName varaiable=new ClassName();
		 
		 Car car1= new Car();
		 car1.make= "Honda";
		 car1.model="Civic Type R";
		 car1.color="Black";
		 car1.door=4;
		 car1.wheels=4;
		 
		 System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
		
		 //define behavior
		 car1.drive();
		 car1.reverse();
		 car1.brake();
		 System.out.println("-------------------------------------------------2nd-----------------------");
		 
		 Car car2= new Car();
		 car2.make="Tesla";
		 car2.model="Model X";
		 car2.color="Blue";
		 car2.door=4;
		 car2.wheels=4;
		 
		 car2.drive();
		 car2.reverse();
		 car2.brake();
		 
		 
	}
	 
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reverse() {
		System.out.println("Car can go in reverse");
	}
	
	void brake() {
		System.out.println("Car can brake itself");
	}

	
	}
	 
