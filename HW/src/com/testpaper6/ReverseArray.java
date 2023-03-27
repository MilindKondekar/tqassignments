package com.testpaper6;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{

		//int arr[] = { 1,2,5,7,3,4};
		int arr[] = { 5,22,55,21,4,54,10}; 
		
		reverseArray(arr);
	}

	private static void reverseArray(int[] arr) 
	{
		int [] brr = new int[arr.length];
		int j,k;
		if(arr.length%2==0)
		{
			j=arr.length/2;
			k=arr.length/2;
		}
		
		else
		{
			j=(arr.length/2)+1;
			k=(arr.length/2)+1;
		}
		
		for(int i=0;i<arr.length/2;i++)
		{ 
			if(arr.length%2==0)
			{
				if(j<arr.length)
				{
					brr[i] =arr[j];
					j++;
				}

				if(k<arr.length)
				{
					brr[k] = arr[i];
					k++;
				}
			}
			
			else
			{
							
				if(j<arr.length)
				{
					brr[i] =arr[j];
					j++;
				}

				if(k<arr.length)
				{
					brr[k] = arr[i];
					k++;
				}
							
				brr[(arr.length/2)] = arr[(arr.length/2)] ;
			}
									
		}

		System.out.println(Arrays.toString(brr));

	}

}
