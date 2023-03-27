package com.testpaper5;

public class Cricketer
{

	private int playerId;
	private String name;
	private boolean isBowler;
	private float strikeRate;
	
	
	Cricketer()
	{
		
	}
	
	
	public Cricketer(int playerId, String name, boolean isBowler, float strikeRate) 
	{
		this.playerId = playerId;
		this.name = name;
		this.isBowler = isBowler;
		this.strikeRate = strikeRate;
	}


	public int getPlayerId() 
	{
		return playerId;
	}


	public void setPlayerId(int playerId) 
	{
		this.playerId = playerId;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public boolean isBowler() 
	{
		return isBowler;
	}


	public void setBowler(boolean isBowler)
	{
		this.isBowler = isBowler;
	}


	public float getStrikeRate() 
	{
		return strikeRate;
	}


	public void setStrikeRate(float strikeRate)
	{
		this.strikeRate = strikeRate;
	}


	
	public String toString() 
	{
		return "playerId=" + playerId + ", name=" + name + ", isBowler=" + isBowler + ", strikeRate="
				+ strikeRate ;
	}
	
	
	
	
}
