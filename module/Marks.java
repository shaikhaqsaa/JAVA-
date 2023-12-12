package com.module;

import java.util.Scanner;

class Marks {
	    public static void main(String[] args) {
	       Scanner in = new Scanner(System.in) ;
	       int a = in.nextInt();
	      String ans = grade(a) ;
	      System.out.println(ans) ;
	        
	        
	    }
	    static String grade(int a ) {
	        if (a>91 && a<100) {
	       return "AA" ;
	        }
	    if (a>81 && a<90){
	        return "AB";
	    }
	    if (a>71 && a<80) {
	        return "BB";
	    }
	        if (a>61 && a<70){
	            return "BC";
	        }
	    if (a>51 && a<60) {
	        return "CD ";
	    }
	        if (a>41 && a<50){
	            return "DD ";
	        }
	    if (a<=40) {
	        return "FAIL";
	    }
	     else   return "please enter valid number ";
	}

}
