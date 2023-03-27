package com.testpaper7;

import java.util.Scanner;

public class NumIsNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0)
		{
			throw new Numberisneg("It is negative num"); 
		}
		
		else
		{
			System.out.println("Valid number");
		}
	}

}


class Numberisneg extends RuntimeException
{
	
	Numberisneg()
	{
		
	}
	
	Numberisneg(String s)
	{
		super(s);
	}
}