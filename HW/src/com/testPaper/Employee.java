package com.testPaper;

public class Employee 
{

	private int id;
	private int age;
	private String name;
	private String role;
	private float salary;
	private float exp;
	private Department1 d1;
	private Department2 d2;
	private Department3 d3;
	
	
	public Employee(int id, int age, String name, String role, float salary, float exp)
	{
		this.id = id;
		this.age = age;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.exp = exp;
		
	}
	
	public Employee(int id, int age, String name, String role, float salary, float exp,Department1 d1) 
	{
		this(id,age,name,role,salary,exp);	
		this.d1 = d1;
	}

	public Employee(int id, int age, String name, String role, float salary, float exp,Department2 d2) 
	{
		
		this(id,age,name,role,salary,exp);	
		this.d2 = d2;
	}
	
	public Employee(int id, int age, String name, String role, float salary, float exp,Department3 d3) 
	{
		
		this(id,age,name,role,salary,exp);	
		this.d3 = d3;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public float getExp() {
		return exp;
	}


	public void setExp(float exp) {
		this.exp = exp;
	}

	public Department1 getD1() {
		return d1;
	}

	public void setD1(Department1 d1) {
		this.d1 = d1;
	}

	public Department2 getD2() {
		return d2;
	}

	public void setD2(Department2 d2) {
		this.d2 = d2;
	}

	public Department3 getD3() {
		return d3;
	}

	public void setD3(Department3 d3) {
		this.d3 = d3;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", role=" + role + ", salary=" + salary
				+ ", exp=" + exp + ", d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}


	
	
	
}
