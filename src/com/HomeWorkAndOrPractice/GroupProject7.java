package com.HomeWorkAndOrPractice;

import java.util.Scanner;

public class GroupProject7 {

	public static void main(String[] args) {
		
		int num;
	    boolean prime=false;
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    num=scan.nextInt();
	    
	    for (int i=2; i<num; i++) {  
	        
	        if (num%i==0) {
	            prime=true;
	        }
	    }
	    if (prime)  {
	        System.out.println(num+" is a prime number!");
	    }else {
	        System.out.println(num+" is NOT a prime number!");
	    }
		
}
}