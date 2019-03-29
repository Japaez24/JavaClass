package com.class12;

public class StringPractice {

	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
//should be 8
  
  	 int max = a[0][0];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] > max) {
                    max = a[j][i];
                }
            }
        System.out.println(max);
        }
	}
}
