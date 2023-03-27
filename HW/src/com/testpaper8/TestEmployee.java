package com.testpaper8;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) 
	{
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(1,"Ram",50000));
		al.add(new Employee(2,"Shyam",45000));
		al.add(new Employee(3,"Ghanshaym",75000));
		
		System.out.println("Before Sorting:"+al);
		
		Collections.sort(al);
		
		System.out.println("After Sorting:"+al);
		

	}

}
