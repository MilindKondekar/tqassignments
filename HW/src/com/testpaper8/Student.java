package com.testpaper8;

public class Student 
{

	private int id;
	private String name;
	private boolean isSpecial;
	private Course c;
	
	
	Student()
	{
		
	}


	public Student(int id, String name, boolean isSpecial, Course c) 
	{
		super();
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.c = c;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isSpecial() {
		return isSpecial;
	}


	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}


	public Course getC() {
		return c;
	}


	public void setC(Course c) {
		this.c = c;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isSpecial=" + isSpecial + ", c=" + c + "]";
	}
	
	
	
}
