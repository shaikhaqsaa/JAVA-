package com.core;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println(" largest value is : "+num1);
		}
		else {
			System.out.println("Largest value is : "+num2);
		}
		
	}

}
