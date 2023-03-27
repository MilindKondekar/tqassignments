package com.StringHw;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		isPalindrome(str);
	}

	private static void isPalindrome(String str) 
	{
		String nstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			nstr=ch+nstr;
		}
		
		if(str.equals(nstr))
		{
			
			System.out.println("It is a palindrome");
		}
		
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
