package com.HomeWorkAndOrPractice;

public class GroupProjectYessica {

	// 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

	public static void main(String[] args) {
		
		int[] numbers= {228,28 ,8 ,88 ,800};
        
        int largest= numbers[0];
        int second=0;
        
        for( int i=0; i<numbers.length; i++) {
            
            if(numbers[i]>largest) {
                second=largest;
                largest=numbers[i];
            }else if(numbers[i]>second && numbers[i] != largest) {
                second=numbers[i];
            }
                
                
                
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The second largest number is "+second);
        int small=numbers[0];
        
        for(int a=0; a<numbers.length; a++) {
            if(numbers[a]<small) {
                small=numbers[a];
            }
        }
        System.out.println("The smallest number is "+small);
	}
}
