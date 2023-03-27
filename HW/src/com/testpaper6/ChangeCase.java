package com.testpaper6;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Big";
		changeCase(str);
		
	}

	private static void changeCase(String str) 
	{
		String nstr="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch<97)
			{
				ch =Character.toLowerCase(ch);
			}
			
			else if(ch>=97)
			{
				ch =Character.toUpperCase(ch);
			}
			
			nstr = nstr+ch;
		}
		System.out.println(nstr);
	}

}
