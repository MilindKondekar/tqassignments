package com.testpaper5;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Random random = new Random();
		int y =random.nextInt(25);
		y=y+1;
		GuessNo(y);
	}

	public static void GuessNo(int y)
	{
		int cnt =5;
		int x;
		System.out.println("Enter number from 1 to 25 or press 0 to exit");
		for(int i=1;i<=5;i++)
		{
			
			x= sc.nextInt();
			if(x==0)
			{
				System.exit(0);
			}
			
			if(x<y)
			{
				System.out.println("Enter higher number or press 0 to exit");
				System.out.println("Attempts remaining "+(5-i));
				
			}
			
			if(x>y)
			{
				System.out.println("Enter lower number or press 0 to exit");
				System.out.println("Attempts remaining "+(5-i));
			}
			
			if(x==y)
			{
				System.out.println("Right ans");
				System.exit(0);
			}
			
		}
		
		System.out.println("Out Off Attempts you lost");


	

	}
}
