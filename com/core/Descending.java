package com.core;

import java.util.Scanner;

public class Descending {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i,j,temp,sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER ARRAY");
			for(i=0;i<a.length;i++) {
				System.out.println("Enter"+i+"element");
				a[i] = sc.nextInt();
				sum = sum+a[i];
			}
			System.out.println("Array Elemeent are : ");
			for(i=0;i<a.length;i++) {
				System.out.println("a["+i+"]"+a[i]);
			}
			System.out.println("sum : "+sum);
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("DESCENDING  ORDER ARE :");
			for(i=0;i<a.length;i++) {
				System.out.println("A["+i+"]"+a[i]);
			}
			
			
			
		
	}

}
