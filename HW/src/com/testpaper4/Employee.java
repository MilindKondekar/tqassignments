package com.testpaper4;

public class Employee   {

	private float salary;
	private String job;
	private String name;
	private int age;


	Employee()
	{

	}


	public Employee(float salary, String job, String name, int age)
	{

		this.salary = salary;
		this.job = job;
		this.name = name;
		this.age = age;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void incrementSal(int sal)
	{
		this.salary=this.salary+sal;
	}


	
	public String toString() 
	{
		return "Employee salary=" + salary + ", job=" + job + ", name=" + name + ", age=" + age ;
	}


   


}
