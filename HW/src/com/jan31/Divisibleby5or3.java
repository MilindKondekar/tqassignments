package com.jan31;

import java.util.Scanner;

public class Divisibleby5or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int num;
	      System.out.println("Enter a Number :: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
	      
	      if(num%5==0)
	      {
	    	  System.out.println(num+" is divisble by 5");
	      }
	      
	      else if(num%11==0)
	      {
	    	  System.out.println(num+" is divisble by 11");
	      }
	      
	      else
	      {
	    	  System.out.println("Number is not divisble by 5 & 11");
	      }
	}

}
