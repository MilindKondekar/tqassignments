package com.testpaper5;

import java.util.Scanner;

public class AvgOfNum {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		avg(num);
		
	}

	static void avg(int num)
	{
		float cnt=0;
		float sum=0;
		while(num!=0)
		{
			sum +=num%10;
			num=num/10;
			cnt++;
			
		}
		
	 float x = (sum/cnt) ;
	 System.out.println(x);
		
	}
}
