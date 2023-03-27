package com.StringHw;

public class RemoveSpace {

	public static void main(String[] args) 
	{
		String Str="Hello How Are You";
		
	   removeSpace(Str);	

	}

	private static void removeSpace(String str)
	{
		
		str = str.replaceAll(" ", "");
		System.out.println(str);
		
	}

}
