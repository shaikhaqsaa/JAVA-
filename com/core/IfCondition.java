package com.core;

import java.util.Scanner;

//import java.util.Scanner;

public class IfCondition {
//	public static void main(String[] args) {
//		int a;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value A: ");
//		a = sc.nextInt();
//		if(a>0) {
//			System.out.print("Number IS POSITIVE ");
//		}
//		else {
//			System.out.print("Number is negative");
//		}
//	}
	
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value :");
		a = sc.nextInt();
		if(a%2==0) {
			System.out.println("value is EVEN");
		}else {
			System.out.println("value is ODD");
		}
		
	}
	

}
