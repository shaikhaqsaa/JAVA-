package com.module;

	// Import necessary Java utilities.
	import java.util.HashSet;
	import java.util.Set;

	
	class Main {
	    
	  
	    public static void InterLeaving(String res, String P, String Q, Set out) {
	       
	        if (P.length() == 0 && Q.length() == 0) {
	            out.add(res);
	            return;
	        }
	        
	       
	        if (P.length() > 0) {
	        	InterLeaving(res + P.charAt(0), P.substring(1), Q, out);
	        }
	        
	     
	        if (Q.length() > 0) {
	        	InterLeaving(res + Q.charAt(0), P, Q.substring(1), out);
	        }
	    }

	  
	    public static void main(String[] args) {
	        
	        String P = "WX";
	        String Q = "YZ";

	       
	        System.out.println("The given strings are: " + P + "  " + Q);
	        System.out.println("The interleavings strings are: ");

	        Set<String> out = new HashSet<>();

	       
	        InterLeaving("", P, Q, out);

	       
	        out.stream().forEach(System.out::println);
	    }
	}



