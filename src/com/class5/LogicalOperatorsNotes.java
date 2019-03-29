package com.class5;

import java.util.Scanner;

public class LogicalOperatorsNotes {
	/*	
	  	Logical and: (& and &&)
		True: TRUE AND TRUE=TRUE
		False: TRUE AND FALSE= False
		False: FALSE AND FALSE=False
		False: FALSE AND FALSE=False

		Logical or: ( || )
		True: True or True= True
		True: True or False= True
		True: False or True=True
		False: False or False= False
		
		Logical 
		 
	*/
	public static void main(String [] args ) {
		/*	If number is between 1-10
		 * 	number is small
		 * 	If number is between 11-100
		 * 	number is medium
		 * 	If number is between 101-1000
		 * 	number is large 
		 */
		
	Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a number from 1-1000");
	int num= myScanner.nextInt();
	
		  // if your int variable was 15 than
	if (num >= 1 && num <= 10) {
 	      //^true and   ^true = true	
		System.out.println("number is small");
	} else if (num >= 11 && num <= 100) {
		         //^false and   ^true = false
		System.out.println("number is medium");
	}else if( num >= 101 && num <= 1000) {
		System.out.println("number is large");
	} else {
		System.out.println("number is not in our range");
		
}
}
}