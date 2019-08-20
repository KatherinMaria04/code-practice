package com.revature.Day4;

public class Testbook {
	public static void main(String[] args) {
		Book obj=new Book();
		obj.name="c";
		//obj.price= 300;
		obj.setPrice(300);
		obj.authorname= "kathy";
		System.out.println("title:" + obj.name +  ",price:" + obj.getPrice() +  "authorname:" + obj.authorname);
		
		Book obj1=new Book("c++",700,"katherin");
				//System.out.println("title:" + obj1.name +  ",price:" + obj1.getPrice() +   "authorname:" + obj1.authorname );
		// if ve use reuse method tostring()
		System.out.println(obj1.toString());
	}
	

}
