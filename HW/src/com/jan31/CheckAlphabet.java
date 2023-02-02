package com.jan31;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Give Input");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int ascii = ch;
		//System.out.println(ascii);
		
		if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
		{
			System.out.println("It is a character");
		}
		
		else if(ascii>=48 && ascii<=57)
		{
			System.out.println("It is a digit");
		}
		
		else if((ascii>=32 && ascii<=47) || (ascii >=58 && ascii<=64) 
		     || (ascii >=91 && ascii <=96) || (ascii >=123 && ascii <=127))
		{
			System.out.println("It is a Special Character");
		}
	}

}
