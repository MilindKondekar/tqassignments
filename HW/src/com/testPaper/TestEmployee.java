package com.testPaper;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,25,"Milind","Engineer",25000,1,new Department1 (1,"Water Resource",21));
		Employee e2 = new Employee(1,23,"Bilind","Engineer",25000,1,new Department2 (2,"PWD",21));
		Employee e3 = new Employee(1,21,"Chilind","Engineer",25000,1,new Department3 (3,"ZP",21));
		
		System.out.println(e1);
		
	}

}
