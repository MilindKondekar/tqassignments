package com.jan31;

import java.util.Scanner;

public class ElecticityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3. Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
		condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
		above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter units");
		
		float units =sc.nextFloat();
		Float total_cost=0f;
		if(units<=50 || units >=50)
		{
			if(units<=50)
			{
				total_cost = (50-units)*0.50f;
				
			}
			
			if(units>50)
			{
				total_cost = (units-50)*0.50f;
				units = units -50;
				
			}
		}
		
		if((units>0 && units<=100) || (units>100))
		{
			if(units<=100)
			{
				total_cost = total_cost + (100-units)*0.75f;
				
			}
			
			if(units>100)
			{
				total_cost = total_cost + (units-100)*0.75f;
				units = units -100;
				
			}
		}
		
		
		
		
	}

}
