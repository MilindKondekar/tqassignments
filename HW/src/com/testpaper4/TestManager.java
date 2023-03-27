package com.testpaper4;

public class TestManager {

	public static void main(String[] args)
	{
		Manager m = new Manager(25000,"Engineer","Milind",25,1);
		System.out.println(m);
		
		m.incrementSal(5000);
		
		System.out.println(m);

	}

}
