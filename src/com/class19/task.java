package com.class19;

public class task {
	public static void main(String[] args) {

		/*
		 * create a method CreateEmail().
		 * Based in provided user name, lastNAme and email type,
		 * your method should return complete email address;
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com
		 */

		task obj = new task();
		String email = obj.createEmail("John", "Snow", "gmail");
		System.out.println(email);

		email = obj.createEmail("Bob", "Snow", "yahoo");
		System.out.println(email);

	}

		// return type methodName

		String createEmail(String name, String lastName, String emailType) {

		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();

	}

}
