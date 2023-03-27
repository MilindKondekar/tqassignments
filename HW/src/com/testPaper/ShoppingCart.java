package com.testPaper;

public class ShoppingCart 
{

	private int cartId;
	private ToothPaste t;
	private WashingPowder w;
	private CookingOil o;
	
	
	ShoppingCart()
	{
		
	}


	public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public ToothPaste getT() {
		return t;
	}


	public void setT(ToothPaste t) {
		this.t = t;
	}


	public WashingPowder getW() {
		return w;
	}


	public void setW(WashingPowder w) {
		this.w = w;
	}


	public CookingOil getO() {
		return o;
	}


	public void setO(CookingOil o) {
		this.o = o;
	}


	
	public String toString() {
		return "ShoppingCart [cartId=" + cartId + ", t=" + t + ", w=" + w + ", o=" + o + "]";
	}
	
	public void Bill()
	{
		int amount=0;
		if(t!=null)
		{
			amount+=t.getPrice();
		}
		if(w!=null)
		{
			amount+=w.getPrice();
		}
		if(o!=null)
		{
			amount+=o.getPrice();
		}
		
		System.out.println("Your Bill is "+amount);
	}
	
	
	
}
