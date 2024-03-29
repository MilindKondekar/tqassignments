package com.testpaper6;

public class Employee 
{
	private int id;
	private float salary;
	private String name;


	Employee()
	{

	}


	public Employee(int id, float salary, String name) 
	{	
		this.id = id;
		this.salary = salary;
		this.name = name;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
	}


	public float getSalary() 
	{
		return salary;
	}


	public void setSalary(float salary)
	{
		this.salary = salary;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public String toString() 
	{
		return "Employee id=" + id + ", salary=" + salary + ", name=" + name ;
	}

    

}
