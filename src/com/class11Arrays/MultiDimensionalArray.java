package com.class11Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
	
	// Creating a 2D array;
	int[][] d= new int[4][4];
	
	
	//1st row
	d[0][0]=12;
	d[0][1]=13;
	d[0][2]=14;
	d[0][3]=15;
	
	// 2nd row
	d[1][0]=1;
	d[1][1]=2;
	d[1][2]=3;
	d[1][3]=4;
	
	// 3rd row
	d[2][0]=5;
	d[2][1]=10;
	d[2][2]=15;
	d[2][3]=20;
	
	// 4th row
	d[3][0]=100;
	d[3][1]=200;
	d[3][2]=300; // please print this one
	d[3][3]=400;

	System.out.println(d[3][2]);
}
}
