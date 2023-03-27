package com.testpaper4;

public class Manager extends Employee 
{

	private int id;

	
	public Manager() 
	{
		super();
		
	}

	public Manager(float salary, String job, String name, int age,int id) 
	{
		super(salary, job, name, age);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String toString() {
		return super.toString()+"Manager [id=" + id + "]";
	}
	
	public void incrementSal(int sal)
	{
		float amt = super.getSalary()+sal;
		super.setSalary(amt);
	}
	
}
