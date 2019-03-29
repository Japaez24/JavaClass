package com.class7;

public class Task16 {

	/*
	 * create a boolean variable workDay and assign true create int variable day and
	 * assign it to 1 as long as it is workDay print--> "I need a day off" and
	 * increment day day once day is 6 --> your condition for your loop should
	 * become false
	 */

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			

			if (day == 6) {
				System.out.println("I do not need a day off ");
				workDay=false;
				
			
			}else {
				System.out.println("i need a day off");
			}
			day++;
		}
}
}
