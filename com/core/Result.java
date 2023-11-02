package com.core;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		int percent,eng,chem,phy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English marks : ");
		eng = sc.nextInt();
		System.out.println("Enter Chemistry marks : ");
		chem = sc.nextInt();
		System.out.println("Enter Physics marks :n ");
		phy = sc.nextInt();
		percent = (eng+chem+phy)*100/300;
		System.out.println("percentage : "+percent);
		if(percent>80) {
			System.out.println("Distinction");
		}else if(percent > 60) {
			System.out.println("First class");
		}else if(percent > 45) {
			System.out.println("Average");
		}else {
			System.out.println("FAIL");
		}
	}

}
