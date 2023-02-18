package com.feb02.switchcase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Number");
		int num1 = sc.nextInt();
		
		switch(num1)
		{
		case 1:  System.out.println("It is a Monday");
		break;
		
		case 2:  System.out.println("It is a Tuesday");
		break;
		
		case 3:  System.out.println("It is a Wednesday");
		break;
		
		case 4:  System.out.println("It is a Thursday");
		break;
		
		case 5:  System.out.println("It is a Friday");
		break;
		
		case 6:  System.out.println("It is a Saturday");
		break;
		
		case 7:  System.out.println("It is a Sunday");
		break;
		
		default : System.out.println("Invalid input");
		}
	}

}
