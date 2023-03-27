package com.StringHw;

import java.util.Scanner;

public class Case 
{
	public static void main(String[] args)
	{

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		caseChange(str);
		
	}

	private static void caseChange(String str) 
	{
		char c;
		String nstr="";
		char ch[] =str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='a')
			{
				c= str.charAt(i);
				c=Character.toUpperCase(c);
				nstr =nstr+c;
				
			}
			
			else
			{
				c =str.charAt(i);
				c=Character.toLowerCase(c);
				nstr=nstr+c;
			}
		}
		
		System.out.println(nstr);
		
	}

}
