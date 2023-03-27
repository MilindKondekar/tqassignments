package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class SwapArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Java");
		al.add("python");
		al.add("c");
		al.add("c++");
		
		
		Iterator<String> itr = al.iterator();
		
		System.out.println("Before Swapping");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		Collections.swap(al, 1, 2);
		
		System.out.println(" After Swapping");
	
		System.out.println(al);
		
	}

}
