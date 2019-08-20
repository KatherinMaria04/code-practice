package com.revature.Day4;

public class Book2 {
	public static void main(String[]args){
		Book book1= new Book("c",200,"katherin");
		Book book2= new Book("java",900,"kathy");
		//Book book2= new Book("c",200,"katherin");
		Book book3=book1;
		System.out.println("HashCode=> book1:" + book1.hashCode() + ",book2:" + book2.hashCode() + "book3:" + book3.hashCode()  );
		System.out.println("is book1==book2 ?" + (book1==book2));
		System.out.println("is book1.equals(book2) ?" + (book1.equals(book2)));
		System.out.println("is book1==book3 ?" + (book1==book3));
		System.out.println("is book1.equals(book3) ?" + (book1.equals(book3)));
	}
}
