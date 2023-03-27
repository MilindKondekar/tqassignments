package com.testpaper4;

import java.util.Scanner;

 class A
{
	static int x =10;
	public static void print()
	{
		System.out.println("Hi");
	}
	
	
}

public  class B extends A
{
	public static void main(String[] args) {
		System.out.println(B.x);
		//System.out.println();
		B.print();
	}
}