package com.testpaper8;

public class Course 
{

	private String cname;
	private int fees;


	Course()
	{

	}


	public Course(String cname, int fees) 
	{
		super();
		this.cname = cname;
		this.fees = fees;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() 
	{
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}

	
}
