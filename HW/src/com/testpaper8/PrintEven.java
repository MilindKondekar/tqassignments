package com.testpaper8;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintEven {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		

		for(int i=1;i<51;i++)
		{
			al.add(i);
		}
		
		System.out.println("Even Numbers are");
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext())
		{
			int x = itr.next();
			if(x%2==0)
			{
				System.out.println(x);
			}
		}
		
	}

}
