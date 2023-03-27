package com.testpaper5;

public class Car {

	private int modelNo;
	private Machine m;
	
	Car()
	{
		
	}

	public Car(int modelNo, Machine m) 
	{
		
		this.modelNo = modelNo;
		this.m = m;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public Machine getM() {
		return m;
	}

	public void setM(Machine m) {
		this.m = m;
	}

	
	public String toString() 
	{
		return "Car modelNo=" + modelNo + ", m=" + m ;
	}
	
	
}
