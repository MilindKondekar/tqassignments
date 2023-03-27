package com.StringHw;

import java.util.Arrays;

public class ReplaceWithCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i love my india";
		
		//System.out.println(str.substring(1));
		replaceWithChar(str);
	}

	private static void replaceWithChar(String str) 
	{
		
		String nstr[] = str.split(" ");
		String gstr;
		String rem;
		
		for(int i=0;i<nstr.length;i++)
		{
			gstr = nstr[i].substring(0,1);
			gstr= gstr.toUpperCase();
			nstr[i] = nstr[i].substring(1);
			nstr[i] = gstr+nstr[i];
			
			
		}
		
		System.out.println(Arrays.toString(nstr));
	}

}
