package com.testpaper5;

public class Engine {

	private String EngineType;
	private int price;
	
	Engine()
	{
		
	}

	
	public Engine(String engineType, int price)
	{
		EngineType = engineType;
		this.price = price;
	}

	public String getEngineType() 
	{
		return EngineType;
	}

	public void setEngineType(String engineType) 
	{
		EngineType = engineType;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}


	
	public String toString() 
	{
		return "EngineType" + EngineType + ", price=" + price + "]";
	}
	
		
	
}
