package com.testpaper6;

public class FrequOfChar {

	public static void main(String[] args) 
	{
		String str="Java is programming language";
		freqOfChar(str);

	}

	private static void freqOfChar(String str) 
	{
		str= str.toLowerCase();
		
		char ch[] = str.toCharArray();
		int cnt;
		char gh=' ';
		for(int i=0;i<str.length();i++)
		{
			cnt =1;
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
			if(ch[i]!=gh)
			{
				System.out.println(ch[i]+":"+cnt);
			}
			
		}
		
	}

}
