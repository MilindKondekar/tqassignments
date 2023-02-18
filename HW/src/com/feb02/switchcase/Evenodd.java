package com.feb02.switchcase;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		switch(num%2)
		{
		case 0:  System.out.println("Even No");
		break;
		
		case 1:  System.out.println("Odd No");
		break;
		
		}
	}

}
