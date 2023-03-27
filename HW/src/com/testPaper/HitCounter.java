package com.testPaper;

public class HitCounter {

	private static int cnt;
	
	
	public HitCounter()
	{
		
	}
	
	{
		cnt++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HitCounter c1 = new HitCounter();
		 c1 = new HitCounter();
		 HitCounter c2 = new HitCounter();
		 System.out.println("Total Hitcount "+cnt);
	}

}
