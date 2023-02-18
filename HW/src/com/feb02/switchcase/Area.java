package com.feb02.switchcase;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Choose From the Following"
				         + "\n 1: Area of the Circle"
				         + "\n 2: Area of right angled triangle"
				         + "\n 3: Area of Rectangle"
				         + "\n 4: Perimeter of Square");
		
		   int s = sc.nextInt();
		
		switch(s)
		{
		
		case 1: System.out.println("Enter Radius");
		        float f = sc.nextFloat();
		        System.out.println("Area of Circle is "+(3.14*f*f));
		        break;
		        
		case 2: System.out.println("Enter Base and Height");
		        float b = sc.nextFloat();
		        float h = sc.nextFloat();
		        System.out.println("Area of right angled Traingle is "+(0.5*b*h));
		        break;
		        
		case 3: System.out.println("Enter Length and Breadth");
		        float l = sc.nextFloat();
		        float B = sc.nextFloat();
		        System.out.println("Area of Rectangle is "+(l*B));
		        break;
		        
		        
		case 4: System.out.println("Enter side");
		        float S = sc.nextFloat();
		        System.out.println("Perimeter of Square is "+(4*S));
		        break;
		        
		default: System.out.println("Invalid Input");
		}
	}

}
