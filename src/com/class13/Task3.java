package com.class13;

import java.util.Scanner;

public class Task3 {

	/*
	 * Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
	 */

public static void main(String[] args) {
	
	Scanner myScanner= new Scanner(System.in);
	String motherName,fatherName, gender, babyName;
	
	myScanner=new Scanner(System.in);
	System.out.println("Please enter mothers name");
	motherName=myScanner.nextLine();
	
	System.out.println("Please enter fathers name");
	fatherName=myScanner.nextLine();
	
	System.out.println("Please enter expected gender");
	gender=myScanner.nextLine();
	
	
	if(gender.equalsIgnoreCase("boy")) {
		babyName=fatherName.substring(0, fatherName.length()/2)+
				motherName.substring(motherName.length()/2);
	}else if(gender.equalsIgnoreCase("girl")){
	babyName=motherName.substring(0, motherName.length()/2)+
			fatherName.substring(fatherName.length()/2);
	}else {
		babyName="No suggestion";
		
	}
	System.out.println(babyName.toUpperCase());
}
}