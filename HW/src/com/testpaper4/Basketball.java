package com.testpaper4;

public class Basketball extends Game
{
	private int players;

	public Basketball() 
	{
		super();

	}

	public Basketball(String name, int id,int players) 
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
		System.out.println("Basket Ball Rules ");
		
	}

	
	public String toString() {
		return super.toString()+" Basketball [players=" + players + "]";
	}

	
	
	
}
