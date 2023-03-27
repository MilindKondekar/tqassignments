package com.testPaper;

public class TestCart {

	public static void main(String[] args) 
	{
	
		ShoppingCart c1 = new ShoppingCart();
		c1.setCartId(1);
		c1.setO(new CookingOil("1xf","Sunny",130));
		c1.setT(new ToothPaste("2fg","Colgate",25));
		System.out.println(c1);
		c1.Bill();
		
	System.out.println("-------------------------------------------");	

		ShoppingCart c2 = new ShoppingCart();
		c2.setCartId(2);
		c2.setO(new CookingOil("2xf","Gemini",150));
		c2.setT(new ToothPaste("3fg","DantKanti",48));
		c2.setW(new WashingPowder("5gh","Nirma",50));
		System.out.println(c2);
		c2.Bill();
		
		
		
	}

}
