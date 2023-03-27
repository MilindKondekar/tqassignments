package com.testpaper6;

import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args)
	{
		Employee [] arr = new Employee[3];
		
		arr[0] = new Employee(1,55000,"Milind");
		arr[1] = new Employee(2,35000,"Vinayak");
		arr[2] = new Employee(3,45000,"Rushi");

		System.out.println("Before Sort :"+Arrays.toString(arr));
		sort(arr);
		System.out.println("After Sort :"+Arrays.toString(arr));
	}

	private static void sort(Employee[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].getSalary()<arr[j].getSalary())
				{
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
