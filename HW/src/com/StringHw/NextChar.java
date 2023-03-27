package com.StringHw;

import java.util.Scanner;

public class NextChar {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter String");
		String str = sc.next();

		nextChar(str);
	}
	
	
	private static void nextChar(String str)
	{
		
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch =str.charAt(i);
			System.out.print(++ch);
		}
			
	}

}
