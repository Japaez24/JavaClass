package com.HomeWorkAndOrPractice;

public class GroupProjectAli {

	// Write a java program to reverse String? Reverse a string word by word?

	public static void main(String[] args) {

        String sentence = "Today we are given some important interview questions";

        String reverse1 = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + sentence.charAt(i);

        }
        String[] words = reverse1.split(" ");
        for (int i=words.length-1;i>0;i--) {
            System.out.print(words[i]+" ");
        }

    }

}
