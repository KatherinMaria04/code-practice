package com.revature;

public class TestAddition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestAddition obj= new TestAddition();	
		 obj.diffval(4,7);
		 obj.diffval(-5,-6);
		 obj.diffval(-29,0);
		 obj.diffval(-50,89);
			}
			public void diffval(int a, int b) {
				int c=a+b;
				System.out.println(c);
			}

	}
