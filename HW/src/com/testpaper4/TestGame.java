package com.testpaper4;

public class TestGame {

	public static void main(String[] args)
	{
		Game g1 = new Basketball("Basketball",1,7);
		g1.rules();
		System.out.println(g1);
		Game g2 = new Football("Football",2,10);
		g2.rules();
		System.out.println(g2);
	}

}
