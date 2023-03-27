package com.testpaper4;

public abstract class Game 
{

	private  String name;
	private int id;
	
	
	public Game()
	{
		
	}
	
	public Game(String name, int id) 
	{
		
		this.name = name;
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
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

	
	abstract public void rules();
	
	public String toString() 
	{
		return "Game name=" + name + ", id=" + id ;
	}
	
	
	
	
}
