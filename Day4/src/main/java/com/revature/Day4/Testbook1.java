package com.revature.Day4;

public class Testbook1 {
	public static void main(String[] args) {
		Book obj=new Book();
		obj.name="c";
		//obj.price= 300;
		obj.setPrice(300);
		obj.authorname= "kathy";
		System.out.println("title:" + obj.name +  ",price:" + obj.getPrice() +  "authorname:" + obj.authorname);
	}

}
