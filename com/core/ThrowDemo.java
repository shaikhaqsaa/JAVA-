package com.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
	public static void demo() throws ArithmeticException,InputMismatchException
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X : ");
		x = sc.nextInt();
		if(x>0) 
		{
			System.out.println("Square "+x+"is"+(x*x));
		}
		else {
			throw new ArithmeticException();
		}
	}
	
	
	public static void main(String[] args) {
		try {
		demo();
		}catch(Exception e) {
			System.out.println("please enter positive value only");
		}finally {
			System.out.println("finally block");
		}
	}
}
