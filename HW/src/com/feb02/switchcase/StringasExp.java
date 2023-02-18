package com.feb02.switchcase;

import java.util.Scanner;

public class StringasExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 5");
		String language = sc.next();
		
		 switch(language) {

	      case "Java":
	        System.out.println(language + " is famous for enterprise applications.");
	        break;

	      case "JavaScript":
	        System.out.println(language + " is famous for frontend and backend.");
	        break;

	      case "Python":
	        System.out.println(language + " is famous for ML and AI.");
	        break;

	      default:
	        System.out.println(language + " not found on record.");
	        break;
		
		
		
	}

	}
}
