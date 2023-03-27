package com.testPaper;

public class Book {

	
	private Author a;
	private int price;
	private String name;
	
	Book()
	{
		
	}

	public Author getA() {
		return a;
	}

	public void setA(Author a) {
		this.a = a;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "Book [a=" + a + ", price=" + price + ", name=" + name + "]";
	}
	
	
	
}
