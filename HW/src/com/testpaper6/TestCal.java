package com.testpaper6;

 interface AdvancedArithmetic
{

	int divisor_sum(int n);
	
		
}

class MyCalculator implements AdvancedArithmetic
{

	public int divisor_sum(int n) 
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
}

 class TestCal
{
	public static void main(String[] args) 
	{
	
		AdvancedArithmetic a = new MyCalculator();
		
		System.out.println(a.divisor_sum(6));
	}
}




