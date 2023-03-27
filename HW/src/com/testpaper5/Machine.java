package com.testpaper5;

public class Machine 
{

	private String machineType;
	private Engine engine;
	
	
	Machine()
	{
		
	}


	public Machine(String machineType, Engine engine) 
	{
		
		this.machineType = machineType;
		this.engine = engine;
	}


	public String getMachineType() 
	{
		return machineType;
	}


	public void setMachineType(String machineType) 
	{
		this.machineType = machineType;
	}


	public Engine getEngine() 
	{
		return engine;
	}


	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}


	
	public String toString() 
	{
		return "machineType " + machineType + ", engine=" + engine + "]";
	}
	
	
	
}
