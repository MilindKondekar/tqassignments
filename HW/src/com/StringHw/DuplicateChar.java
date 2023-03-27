package com.StringHw;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		frequency(str);
		
	}

	private static void frequency(String str) 
	{
		int cnt;
		str=str.toLowerCase();
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			cnt=1;
			if(ch[i]=='\0')
			{
				continue;
			}
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j] ='\0';
				}
			}
			
			if(cnt>1)
			{
				System.out.println(ch[i]+": "+cnt);
			}
			
		}
		
	}

	

}
