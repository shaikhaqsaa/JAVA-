package com.core;

import java.util.Scanner;

public class TwoDarray {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER 2 D Array : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter"+i+"Row & "+j+"Column :");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("2D Array is ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
