package com.testpaper5;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[] = {'a','b','b','n','u','y','x','s','y'};
		
		duplicates(arr);
		
	}

	private static void duplicates(char[] arr) 
	{   int cnt;
		char temp[] = new char[arr.length];
		int k =0;
		for(int i=0;i<arr.length;i++)
		{    cnt=0;
		    if(arr[i]=='\0')
		    {
		    	continue;
		    }
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j]))
				{
					cnt++;
					arr[j]='\0';
				}
			}
			if(cnt==0)
			{
				temp[k++] =arr[i];
			}
		}
		
		for(int i=0;i<k;i++)
		{
			arr[i] = temp[i];
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
