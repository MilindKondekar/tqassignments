package com.StringHw;

import java.util.Scanner;

public class CountWords {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String str = "Hi Hello, How Are You";
		
		countWords(str);
	}
	private static void countWords(String str) 
	{
		int cnt=0;
		String nstr[] = str.split(" ");
		
		for(int i=0;i<nstr.length;i++)
		{
			cnt++;
		}
	
		System.out.println("Total Words :"+cnt);
	}

}
