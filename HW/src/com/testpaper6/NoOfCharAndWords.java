package com.testpaper6;

public class NoOfCharAndWords {

	public static void main(String[] args) 
	{
		
		String str="Java is programming language java";
		noOfCharandWords(str);
	}

	private static void noOfCharandWords(String str) 
	{
		String nstr[] = str.split(" ");
		int noOfWords = nstr.length;
		int noOfChars=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			
			else 
			{
				noOfChars++;
			}
		}
		
		System.out.println("Total Words :"+noOfWords
				          +"\nTotal Characters:"+noOfChars);
		
	}

}
