package com.jan31;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		System.out.println("Enter operation '+','-','*','/'");
		char str = sc.next().charAt(0);
		
		if(str=='+')
		{
			System.out.println("The addition is "+(num1+num2));
		}
		
		else if(str=='-')
		{
			System.out.println("The substraction is "+(num1-num2));
		}
		
		else if(str=='*')
		{
			System.out.println("The Multiplication is "+(num1*num2));
		}
		
		else if(str=='/')
		{
			System.out.println("The Division is "+(num1/num2));
		}
		
	}

}
