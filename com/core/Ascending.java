package com.core;

import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		int a[]= new int[5];
		int i,j,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER Array : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		System.out.println("Array Element are : ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a[" +i+ "]" +a[i]);
		}
		System.out.println("sum : "+sum);
		for(i=0;i<a.length;i++) 
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j] )
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending order :");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]"+a[i]);
		}
		
	}
}
