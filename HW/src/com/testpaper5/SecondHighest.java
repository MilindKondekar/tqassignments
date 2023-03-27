package com.testpaper5;

public class SecondHighest {

	public static void main(String[] args) 
	{


		int arr[] = {7,4,9,6,8,1,5,4,5,7};

		secondHighest(arr);
	}

	private static void secondHighest(int[] arr) 
	{
      int highest = Integer.MIN_VALUE;
      int secondhighest = Integer.MIN_VALUE;
      
      
      for(int i=0;i<arr.length;i++)
      {
    	 if(highest<arr[i])
    	 {
    		 secondhighest = highest;
    		 highest = arr[i];
    		 
    	 }
    	 
    	 else if(arr[i]<highest && arr[i]>secondhighest)
    	 {
    		 secondhighest  = arr[i];
    		 
    	 }
      }
      
       System.out.println("Second Highest "+secondhighest);
	}



}
