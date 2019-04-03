package com.HomeWorkAndOrPractice;

public class GroupProjectTayyab {

	// 4.How to find out the part of the string from a string? What is substring? Find number of words in string?

	public static void main(String[] args) {

		String name = "Tayyab is nice";
		boolean contains = true;
		String[] array = name.split("is");
		System.out.println("The length is " + array.length);

		if (name.contains("nice")) {
			System.out.println(contains);
		} else {
			System.out.println("false");
		}

	}

}
