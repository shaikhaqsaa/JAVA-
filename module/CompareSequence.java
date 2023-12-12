package com.module;


	
	public class CompareSequence {
	   
	    public static void main(String[] args) {
	        
	        String str1 = "example.com", str2 = "topsint.com";
	        
	        
	        CharSequence cs = "Topsint.com";
	        
	       
	        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
	        
	        
	        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));
	    }
	}

