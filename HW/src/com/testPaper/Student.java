package com.testPaper;

public class Student 
{

	private int id;
	private int age;
	private String name;
	private float marks;
	private static int numOfStudents;
	
	
	
	public Student(int id, int age, String name, float marks)
	{
		
		this.id = id;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	
	 
	{
	   numOfStudents++;	
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


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public static int getNumOfStudents() {
		return numOfStudents;
	}


	
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks 
				+ "\nNumber Of Students Registered :"+numOfStudents;
	}

	
}
