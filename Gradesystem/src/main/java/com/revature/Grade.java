package com.revature;

public class Grade {
	//test driven development(TDD)

	public static String gradeval(int a) {
 String grade=null;
		if(a>=80 &&a<=100) {
			grade="A";
			}
		else if(a>=60 && a<=80) {
			grade="B";
		}
		else if(a>=50 && a<=60) {
			grade="C";
	}
		else if(a<=50 && a>0) {
			grade="F";
		}
		else {
			System.out.println("invalid");
		}
		return grade;
	}
}


