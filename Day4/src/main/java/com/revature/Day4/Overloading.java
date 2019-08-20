package com.revature.Day4;

public class Overloading {
	public  static int add(int a,int b) {
		return a+b;
	
	}
 public static String add(String d,String b) {
	 return d+b;
	
 }
 public  static int add(int a,int b,int c) {
	 return a+b+c;
 }
 public static void main(String[] args) {
	 System.out.println(add("c","d"));
	 System.out.println(add(4,7));
	 System.out.println(add(9,10,11));
	 
 }
}
