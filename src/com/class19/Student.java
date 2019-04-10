package com.class19;

public class Student {
	
	public static void main(String[] args) {
		
	
	/* Create class Student that will have a method getGrade
	 * your method should accept the score of a student and return a grade 
	 * score >90 return A
	 * score >80 return B
	 * score >70 return C
	 * score >50 return D
	 * anything else return F
	 */
	
	Student obj= new Student();
	char myGrade=obj.getGrade(79);
	System.out.println("My grade at syntax is "+myGrade);
	
	
	}
	
	//Return Method
	
	char getGrade(int score) {
	
		char grade = 0;
		
		if (score >90) {
			grade= 'A';
			
		}else if(score >80) {
			grade= 'B';
			
		}else if(score >70) {
			grade= 'C';
			
		}else if (score >=50) {
			grade= 'D';
			
		}else if (score <50) {
			grade= 'F';
			
	}
		return grade;
}
}