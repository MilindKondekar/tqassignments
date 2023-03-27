package com.testpaper6;

public class RepeatedWord {

	public static void main(String[] args) 
	{
		String str="Big black bug bit a big black dog";

		repeatedWord(str);
	}

	private static void repeatedWord(String str) 
	{
		int cnt=0;
		
		String qstr="";
		str = str.toLowerCase();
		String gstr[] = str.split(" ");
		
		for(int i=0;i<gstr.length;i++)
		{
			cnt=1;
			for(int j=i+1;j<gstr.length;j++)
			{
				if(gstr[i].equals(gstr[j]))
				{
				    cnt++;  	
				}
				
			}
			if(cnt>1)
			{
				System.out.println(gstr[i]+" : "+cnt);
			}
				
		}
		
	}

}
