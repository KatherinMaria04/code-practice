package com;

public class Validation {
	 public static void main(String[] args)throws Exception {

	        String name = "Naresh";
	        String department = null;
	       // try {
	            validating(name, department);
	            add(name, department);
	       // }
	       // catch(Exception e) {
	         //   e.printStackTrace();
	        //    System.out.println(e.getMessage());
	       // }
	      

	 }
	    public static void validating(String name, String department) throws Exception {
	        System.out.println("Valid");
	        try {
	        if (name == null) {
	            throw new Exception("Invalid ");
	        }
	        if (department == null) {
	            throw new Exception("Invalid");
	        }
	        }catch(Exception e) {
	           // e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	    }
	        public static void add(String name, String department) {
	            System.out.println("Adding Student Details to DB");
	            System.out.println("Name:" + name);
	            System.out.println("Department:" + department);
	        }
}
