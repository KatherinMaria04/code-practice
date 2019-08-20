package com;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names= new HashSet<String>();
		names.add("kathy");
		names.add("katherin");
		names.add("kathy");
		System.out.println(names);

		TreeSet<String> name= new TreeSet<String>();
		name.add("kathy");
		name.add("priyanka");
		name.add("nithu");
		name.add("sharmi");
		System.out.println(name);
		
	}

}
