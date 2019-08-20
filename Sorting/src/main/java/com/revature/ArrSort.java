package com.revature;

import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] deptNames= {"CSE","MECH","IT","EEE"};
		System.out.println("before sorting:");
		for(String d: deptNames)
		{
			System.out.println(d);
		}
		System.out.println("after sorting");
		Arrays.sort(deptNames);
		for(String d: deptNames)
		{
			System.out.println(d);
		}
		

	}

}
