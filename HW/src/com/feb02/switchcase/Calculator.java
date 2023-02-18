package com.feb02.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Choose Operation: '+','-','*','/'");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':  System.out.println("Addition is "+(num1+num2));
		break;
		
		case '-':  System.out.println("Substraction is "+(num1-num2));
		break;
		
		case '*':  System.out.println("Multipilcation  is "+(num1*num2));
		break;
		
		case '/':  System.out.println("Division  is "+(num1/num2));
		break;
		
		}

	}

}
