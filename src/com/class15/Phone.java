package com.class15;

public class Phone {

	String Brand, color, model;
	boolean  camera;

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		
		phone1.Brand= "Iphone";
		phone1.model="X";
		phone1.camera= true;
		phone1.color= "Black";
		
		System.out.println("My phone is a "+phone1.Brand+" "+phone1.model+" & the color is "+phone1.color);
		phone1.texting();
		phone1.playMusic();
		phone1.phoneCalls();
		System.out.println();
		
		Phone phone2= new Phone();
		
		phone2.Brand= "Android";
		phone2.model="Galaxy";
		phone2.camera= true;
		phone2.color= "White";
		
		System.out.println("My phone is a "+phone2.Brand+" "+phone2.model+" & the color is "+phone2.color);
		
		phone2.texting();
		phone2.playMusic();
		phone2.phoneCalls();
		System.out.println();
		
		Phone phone3= new Phone();
		
		phone3.Brand= "Nokia";
		phone3.model="Brick";
		phone3.camera= true;
		phone3.color= "Grey and blue";
		
		System.out.println("My phone is a "+phone3.Brand+" "+phone3.model+" & the color is "+phone3.color);
		
		phone3.texting();
		phone3.playMusic();
		phone3.phoneCalls();
	}	

	void texting() {
		System.out.println(Brand + " is able to text");
	}

	void playMusic() {
		System.out.println(Brand + " is able to play music");
	}

	void phoneCalls() {
		System.out.println(Brand + " is able to make phone calls");
	}

}
