package com.testPaper;

import java.util.Scanner;

class Car {

	private int carId;
	private String brand;
	private String modelNumber;
	private String fuel;
	private int price;
	
	
	 

	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModelNumber() {
		return modelNumber;
	}


	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void enterDetails(int carid, String brand, String modelnumber)
	{
		this.carId=carid;
		this.brand =brand;
		this.modelNumber=modelnumber;
		System.out.println("First Method called");
		
	}
	
	public void enterDetails(int carid, String brand, String modelnumber, int price)
	{
		this.carId=carid;
		this.brand =brand;
		this.modelNumber=modelnumber;
		this.price = price;
		System.out.println(" Second called");
	}
	
	
	public void enterDetails(int carid,String brand,String modelnumber,int price,String fuel)
	{
		this.carId=carid;
		this.brand =brand;
		this.modelNumber=modelnumber;
		this.price = price;
		this.fuel = fuel;
		System.out.println("Third Method called");
	}


	
	public String toString() 
	{
		return "carId=" + carId + ", brand=" + brand + ", modelNumber=" + modelNumber + ", fuel=" + fuel
				+ ", price=" + price ;
	}
	
}

public class TestCar
{
	public static void main(String[] args) 
	{
		
		Car c1  = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		c1.enterDetails(sc.nextInt(), sc.next(), sc.next());
		c1.enterDetails(sc.nextInt(), sc.next(), sc.next(),sc.nextInt());
		c1.enterDetails(sc.nextInt(), sc.next(), sc.next(),sc.nextInt(),sc.next());
		
	}
}



