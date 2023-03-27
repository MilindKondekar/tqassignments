package com.testpaper6;

public class EqualEleInArray {

	public static void main(String[] args)
	{
		String arr1[] ={"Java","C","Python","Oracle"};
		
		String arr2[] ={"Angular","Java","SQL","SpringBoot","Oracle"};
		
		equalEle(arr1,arr2);

	}

	private static void equalEle(String[] arr1, String[] arr2) 
	{
		
		String nstr[] = new String[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					System.out.println(arr1[i]);
				}
			}
			
			
		}
		
	}

}
