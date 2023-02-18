package com.feb02.switchcase;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		char c = Character.toUpperCase(ch);
		
		switch(c)
		{
		
		case 'A' : 
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : System.out.println("It is vowel");
		break;
		
		default: System.out.println("It is a consonent");
		
		}
	}

}
