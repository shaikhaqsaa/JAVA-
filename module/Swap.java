package com.module;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
		 
	    public static void main(String a[]) throws Exception
	    {
	 
	      
	        ArrayList<String> ArrList = new ArrayList<String>();
	 
	        
	        ArrList.add("Item 1");
	        ArrList.add("Item 2");
	        ArrList.add("Item 3");
	        ArrList.add("Item 4");
	        ArrList.add("Item 5");
	 
	        
	        System.out.println("Before Swap the ArrayList ");
	        System.out.println(ArrList);
	 
	        Collections.swap(ArrList, -1, 2);
	    }
	}
