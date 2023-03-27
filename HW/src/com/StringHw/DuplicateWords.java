package com.StringHw;

public class DuplicateWords {

	public static void main(String[] args) 
	{
        String str = "Hi Hello, How Hi Are You hi where were you";
		
		duplicateWords(str);

	}

	private static void duplicateWords(String str) 
	{
		str = str.toLowerCase();
		String nstr[] = str.split(" ");
		int cnt;
		for(int i=0;i<nstr.length;i++)
		{
			cnt=1;
			
			if(nstr[i]=="Visited")
			{
				continue;
			}
			
			for(int j=i+1;j<nstr.length;j++)
			{
				if(nstr[i].equals(nstr[j]))
				{
					nstr[j] ="Visited";
					cnt++;
					
				}
			}
			if(cnt>1)
			{
				System.out.println(nstr[i]+":"+cnt);
			}
		}
		
		
	}

}
