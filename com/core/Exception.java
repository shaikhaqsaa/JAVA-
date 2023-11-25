package com.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
public static void main(String[] args) {
	System.out.println("Start code");
	int a,b,c;
	
	try{Scanner sc = new Scanner(System.in);
	System.out.print("Enter A : ");
	a= sc.nextInt();
	System.out.print("Enter B : ");
	b = sc.nextInt();
	c = a/b;
	System.out.print("Division : "+c);
	}catch(ArithmeticException e) {
		System.out.println("Exception caught");
	}
	catch(InputMismatchException e){
		System.out.println("Exception caught");
		
	}
	System.out.println("End code");
}
}
