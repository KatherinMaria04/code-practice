package com;

import java.util.ArrayList;

public class SessionArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList book=new ArrayList();
		book.add("java program");
		book.add("c program");
		book.add("python");
		book.add(123);
		
		for(Object booklist:book) {
			//shows casting exception to avoid exception use generics in arrylist
			String bookname=(String) booklist;
			System.out.println(booklist);
		}
		
		
		

	}

}
