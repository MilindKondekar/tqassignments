package com.testpaper4;

public class Ambiguity 
{
	public void m1(float i,int j){
		System.out.println("float method ");
	}

	public void m1(int i, float j){
		System.out.println("int method ");
	}

	public static void main(String[] args) {
		Ambiguity a=new Ambiguity();
		//a.m1(10,10); // The method m1(float, int) is ambiguous for the type Test
	}
}
