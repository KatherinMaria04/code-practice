package com;
import java.util.HashMap;
public class Test2 {
public static void main(String[] ags) {
	HashMap<String,Integer> bookprice= new HashMap<String,Integer>();
	 bookprice.put("c",200);
	 bookprice.put("python",300);
	 bookprice.put("java",600);
	 
	System.out.println("contains:  "   + bookprice.containsKey("java"));
	 for(String book:bookprice.keySet()) {
		 Integer price= bookprice.get(book);
		 System.out.println("bookname:" + book +  ",price:" + price);
		 
	 }
	
}
}
