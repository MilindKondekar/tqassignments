package com.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> h1 = new HashMap<>();
		
		h1.put(1, "Red");
		h1.put(2, "Blue");
		h1.put(3, "Yellow");
		System.out.println(h1.put(1, "Sky Blue"));
		
		
		System.out.println(h1);

		HashMap<String,String> h2 = new HashMap<>();
		//h1.put("A", "Hello");
		
		
	}

}
