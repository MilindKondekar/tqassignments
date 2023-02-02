package com.jan31;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a character ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		if(ch=='a' || ch=='i'  || ch=='o' || ch=='e' || ch=='u'
		 || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("It is a vowel");
		}
		
		else
		{
			System.out.println("It is a consonent");
		}
	}

}
