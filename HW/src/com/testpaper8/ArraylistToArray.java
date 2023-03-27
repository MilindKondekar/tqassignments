package com.testpaper8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistToArray {

	public static void main(String[] args) 
	{
     ArrayList<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("Dotnet");
	
		//to array object  1st way
    Object[] arr = list.toArray();
     
     System.out.println(Arrays.toString(arr));
     
     //to array 2nd way
     
     String brr[] = new String[list.size()];
     list.toArray(brr);
     System.out.println(Arrays.toString(brr));
     
     
     //to ArrayList 1st way
     
     List<String> l1 =  Arrays.asList(brr);
     
     System.out.println("Using 1st way :"+l1);
     // to ArrayList 2nd way
     
     ArrayList<String> l2 = new ArrayList<>(Arrays.asList(brr));
     System.out.println("Using 2nd way :"+l2);
     
     // to ArrayList 3rd way
     ArrayList<String> l3 = new ArrayList<>();
     Collections.addAll(l3, brr);
     System.out.println("Using 3rd way :"+l3);
	}

}
