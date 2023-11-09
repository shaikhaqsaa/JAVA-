package com.core;

import java.util.Scanner;

class A{
	int a;
	void SetA() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = sc.nextInt();
	}
	void PutA() {
		System.out.println(" A : "+a);
	}
}
class B extends A{
	int b;
	void SetB() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter B : ");
		b = sc.nextInt();
	}
	void PutB() {
		System.out.println(" B : "+b);
	}
}
class C extends B{
	int c;
	void SetC() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter C : ");
		c = sc.nextInt();
	}
	void PutC() {
		System.out.println("C "+c);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		C c1 = new C();
		c1.SetA();
		c1.SetB();
		c1.SetC();
		c1.PutA();
		c1.PutB();
		c1.PutC();
	}

}
