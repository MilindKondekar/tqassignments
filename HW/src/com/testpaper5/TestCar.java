package com.testpaper5;

import java.util.Scanner;

public class TestCar {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
	
		enterDetailsConstructor();
		enterDetailsGetterSetter();

	}

	private static void enterDetailsGetterSetter() 
	{
		   Car c = new Car();
		   System.out.println("Enter Car No");
		   c.setModelNo(sc.nextInt());
		   System.out.println("Enter Machine Type");
		   c.setM(new Machine());
		   c.getM().setMachineType(sc.next());
		   System.out.println("Enter Engine Type");
		   c.getM().setEngine(new Engine());
		   c.getM().getEngine().setEngineType(sc.next());
		   System.out.println("Enter price");
		   c.getM().getEngine().setPrice(sc.nextInt());
		   
		
	}

	private static void enterDetailsConstructor() 
	{
		System.out.println("Enter Car No");
		int model = sc.nextInt();
		System.out.println("Enter Machine Type");
		String mtype =sc.next();
		System.out.println("Enter Engine Type");
		String etype =sc.next();
		System.out.println("Enter price ");
		int price  = sc.nextInt();
		Car c = new Car(model,new Machine(mtype,new Engine(etype,price)));
		
	}

}
