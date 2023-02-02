package com.jan31;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Name");
		String str = sc.next();
		
		
		if(str.equalsIgnoreCase("January"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("February"))
		{
			System.out.println("28 Days");
		}
		
		else if(str.equalsIgnoreCase("March"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("April"))
		{
			System.out.println("30 Days");
		}
		
		else if(str.equalsIgnoreCase("May"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("June"))
		{
			System.out.println("30 Days");
		}
		
		else if(str.equalsIgnoreCase("July"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("August"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("September"))
		{
			System.out.println("30 Days");
		}
		
		else if(str.equalsIgnoreCase("October"))
		{
			System.out.println("31 Days");
		}
		
		else if(str.equalsIgnoreCase("November"))
		{
			System.out.println("30 Days");
		}
		
		else if(str.equalsIgnoreCase("December"))
		{
			System.out.println("31 Days");
		}
		
		
		
	}

}
