package com.core;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("A : ");
		a = sc.nextInt();
		System.out.println("B : ");
		b = sc.nextInt();
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION ");
		System.out.println("3. MULTIPLICATION ");
		System.out.println("4. DIVISION");
		System.out.println("ENTER YOUR CHOICE : ");
		d = sc.nextInt();
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("ADDITION : "+c);
			break;
		case 2:
			c = a-b;
			System.out.println("SUBTRACTION : "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("MULTIPLICATION : "+c);
			break;
		case 4:
			c=a/b;
			System.out.println("DIVISION : "+c);
			break;
			default:
				System.out.println("invalid choice");
				break;
			
		}
	}

}
