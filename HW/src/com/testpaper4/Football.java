package com.testpaper4;

public class Football extends Game
{
	private int players;

	public Football() 
	{
		super();

	}

	public Football(String name, int id,int players) 
	{
		super(name, id);
		this.players=players;
		
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	@Override
	public void rules() {
		System.out.println("Football Ball Rules ");
		
	}

	
	public String toString() {
		return super.toString()+" Football [players=" + players + "]";
	}

	
	
	
}
