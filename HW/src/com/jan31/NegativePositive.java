package com.jan31;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		float num = sc.nextFloat();
		
		if(num <0)
		{
			System.out.println("Negative number");
		}
		
		else if(num > 1)
		{
			System.out.println("Positive number");
		}
		
		else if(num == 0)
		{
			System.out.println("Zero");
		}
	}

}
