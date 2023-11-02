package com.core;

import java.util.Scanner;

public class Sample {
	
	/*
	 * public static void main(String[] args) { System.out.println("welcome java");
	 * System.out.println("java is best"); }
	 */
	
	/*
	 * public static void main(String[] args) { int a,b,c; Scanner sc=new
	 * Scanner(System.in); System.out.print("enter a :"); a = sc.nextInt();
	 * System.out.print("enter B :"); b = sc.nextInt(); c = a+b;
	 * System.out.println("addition : "+c);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A :");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		c= a+b;
		System.out.println("result : "+c);
	}
}
