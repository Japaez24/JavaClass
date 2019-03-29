package com.class8;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
	// let user define a range of numbers to print
		
	int start;
	int end;
	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("Please define the range of two numbers");
	start= myScanner.nextInt();
	end= myScanner.nextInt();
	
	for (int i= start; i<= end ; i++) {
		System.out.println(i);
	}
/*
 * package com.class8;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        /* let user define a range of numbers to print  plus if else statement

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a starting number");
        int startNumber = scan.nextInt();

        System.out.println("Please enter ending number");
        int endNumber = scan.nextInt();

        if (startNumber > endNumber) {

                for (int i = startNumber; i <= endNumber; i++) {
                    System.out.println(i);
                }
            
        } else {
            System.out.println("I won't run your code");
        }

    }
}*/
	}
	}
