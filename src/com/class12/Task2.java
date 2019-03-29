package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Accept username, password and confirm password and check following requirements:

		Username and Password cannot be  empty, if so message=”Username and Password cannot be empty”.
		
		Password should be minimum 8 characters, if less  message=”Password is too short”.
		
		Password cannot contain username if so,  message=”Password cannot contain username”.
		
		Password should match confirmed password, if not  message “Passwords do not match”.
		
		Only after all requirements met  message “Your username and password has been created”
		 */
					
			Scanner myScanner= new Scanner(System.in);
			System.out.println("Please input Username");
			String userName= myScanner.next();
			
			System.out.println("Please input Password");
			String password= myScanner.next();
			
			System.out.println("Please confrim Password");
			String confirmed= myScanner.next();
				
			if(!userName.isEmpty() || !password.isEmpty() ) {
				
				if(password.length()<8) {
					System.out.println("Password is too short");
					 
				}else if(password.contains(userName)) {
					System.out.println("Password cannot contain username");
					
				}else if(!password.equals(confirmed)) {
					System.out.println("Passwords do not match");
					
				}else {
					System.out.println("Your Username and Password have been created");
				}
			
			}else {
				System.out.println("Your username and password cannot be empty");	
}
}	
}
	