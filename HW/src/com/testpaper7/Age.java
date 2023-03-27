package com.testpaper7;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int x = sc.nextInt();
		
		age(x);
	}

	private static void age(int x) 
	{
		
		if(x<18 || x<0)
		{
			throw new Invalidage("You cannot vote");
		}
		
	}
}

class Invalidage extends RuntimeException
{
	Invalidage(String s)
	{
		super(s);
	}
}