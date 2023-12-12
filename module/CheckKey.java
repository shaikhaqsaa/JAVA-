package com.module;

import java.util.HashMap;

public class CheckKey {  
		   public static void main(String args[]) {
		  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		  hash_map.put(1, "aqsa");
		  hash_map.put(2, "shaikh");
		  hash_map.put(3, "munib");
		  hash_map.put(4, "shadma");
		  hash_map.put(5, "iqra");
		
		  boolean result = hash_map.isEmpty();
		  
		  System.out.println("Is hash map empty: " + result);
		
		  hash_map.clear();
		 
		  result = hash_map.isEmpty();
		 
		  System.out.println("Is hash map empty: " + result);
		 }
		}

