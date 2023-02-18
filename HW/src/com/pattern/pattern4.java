package com.pattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
		{ 
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = 0; j <=i; j++)
			{
				System.out.print(" ");
			}
			
			int x=1;
			for (int k = rows-1; k > i ; k--)
			{
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
		
		
		
	}

}
