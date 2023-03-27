package com.testpaper5;

public class MaxAndMin {

	public static void main(String[] args) 
	{
		int arr[] = {54,12,87,96,62,7};
       
		MaxAndMin(arr);
	}

	private static void MaxAndMin(int[] arr) 
	{
		int max =Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{			
				if(max<arr[i])
				{
					max =arr[i];
				}
				
			   if(min>arr[i])
			   {
				   min =arr[i];
			   }		
		}
		
		System.out.println("Max:"+max+" Min :"+min);
	}

}
