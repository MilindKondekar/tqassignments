package com.jan31;

import java.util.Scanner;

public class GrossSalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2. Write a Java program to input basic salary of an employee and calculate its 
		Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, 
		DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95% */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		float basic_sal = sc.nextFloat();
		
		if(basic_sal<=10000)
		{
			float da =(basic_sal*80/100);
			float hra = (basic_sal*20/100);
			float Gross_Sal= basic_sal+hra+da;
			System.out.println("Gross Salary is "+Gross_Sal);
		}
		
		else if(basic_sal<=20000)
		{
			float da =(basic_sal*90/100);
			float hra = (basic_sal*25/100);
			float Gross_Sal= basic_sal+hra+da;
			System.out.println("Gross Salary is "+Gross_Sal);
		}
		
		else if(basic_sal>20000)
		{
			float da =(basic_sal*95/100);
			float hra = (basic_sal*30/100);
			float Gross_Sal= basic_sal+hra+da;
			System.out.println("Gross Salary is "+Gross_Sal);
		}
	}

}
