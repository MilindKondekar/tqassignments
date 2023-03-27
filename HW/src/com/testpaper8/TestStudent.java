package com.testpaper8;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args)
	{
	
		
		
		Student arr[] = new Student[5];
		
		arr[0] = new Student(1,"Ram",false,new Course("Java",55000));
		arr[1] = new Student(2,"Shyam",false,new Course("Python",25000));
		arr[2] = new Student(3,"GhanShyam",false,new Course("Dotnet",25000));
		arr[3] = new Student(4,"Pravin",false,new Course("JavaScript",75000));
		arr[4] = new Student(5,"Umesh",false,new Course("React",5000));
		
		ArrayList<Student> al = new ArrayList<>(Arrays.asList(arr));
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getId()
					           +"\n"+al.get(i).getName()
					           +"\n"+al.get(i).getC().getCname()
					           +"\n"+al.get(i).getC().getFees());
			System.out.println("================================");
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getC().getFees()>50000)
			{
				al.get(i).setSpecial(true);
			}
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getId()
					           +"\n"+al.get(i).getName()
					           +"\n"+al.get(i).getC().getCname()
					           +"\n"+al.get(i).getC().getFees()
			                   +"\n"+al.get(i).isSpecial());
			System.out.println("================================");
		}
		
		
		
	}

}
