package com.revature.Day4;

 class Bank {
	 void display() {
	System.out.println("parent class");	
	}
}

	 class Yesbank extends Bank{
		 void display() {
			 System.out.println("child class yesbank");
		 }
	 }
	  class Indianbank extends Bank{
		 void display() {
			 System.out.println("child class indianbank");
		 }
	 }		 
	 
        public class TestBank{
        	 public static void main(String[] args) {
        		//	Bank obj=new Bank();
        		 //Indianbank obj=new Indianbank();
        		Bank d= new Yesbank();
        				 d.display();
        	 }
          }


