package com.testpaper4;

import java.util.Scanner;

public class Divisibleby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num  = sc.nextInt();
		divisibleby3(num);
	}

	
	public static void divisibleby3(int num)
	{
		
		for(int i=0;i<=num;i++)
		{
			if(i%3==0)
			{
				System.out.println(i+" ");
			}
		}
		
	}
	
}
