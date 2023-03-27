package com.StringHw;

import java.util.Scanner;

public class ChangeVoewlCase {
	
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		String str = sc.next();
		encode(str);
	}
	
	
	private static void encode(String str) 
	{
		
		String nstr="";
		char c;
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
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
			
			else if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
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
			else
			{
				c= str.charAt(i);
				nstr =nstr+c;
				
				
			}
			
		}
		
		System.out.println(nstr);
		
	}
}
