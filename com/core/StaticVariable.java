package com.core;

import java.util.Scanner;

public class StaticVariable {
	static int a;
	void setA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	void PutB() {
		System.out.println("A : "+a);
	}
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable();
		StaticVariable s2 = new StaticVariable();
		StaticVariable s3 = new StaticVariable();
		
		s1.setA();
		s2.setA();
		s3.setA();
		
		s1.PutB();
		s2.PutB();
		s3.PutB();
		
	}
}
