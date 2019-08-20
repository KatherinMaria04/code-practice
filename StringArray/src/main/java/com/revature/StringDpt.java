package com.revature;

public class StringDpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] deptName= {"CSE", "IT","ECE","EEE"};
		String deptNames="CSE";
		boolean exists= false;
		for(String dname :deptName) {
			if(dname == deptNames) {
			exists=true;
		}
	}
		System.out.println(exists);
		
	// to find the index value
	for(int i=0;i<deptName.length;i++) {
		if (deptName[i]== "CSE")
			System.out.println(i);
			break;
	}
}
}

