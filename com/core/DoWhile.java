package com.core;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		n = sc.nextInt();
		do {
			sum= sum+n;
			n--;
		}while(n>0);
		System.out.println("sum : "+sum);
	}

}
