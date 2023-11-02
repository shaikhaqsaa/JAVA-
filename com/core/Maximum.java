package com.core;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value : " );
		num1 = sc.nextInt();
		System.out.println("Enter second value : ");
		num2 = sc.nextInt();
		System.out.println("Enter third value : ");
		num3 = sc.nextInt();
		if(num1 > num2 && num1>num3) {
			System.out.println("Largest number is : "+num1 );
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Largest number is : "+num2);
		}else if(num3 > num1 && num3 > num1) {
			System.out.println("Largest number is : "+num3);
		}else {
			System.out.println("error");
		}
	}
}