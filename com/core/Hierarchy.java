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
class C extends A{
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
class D extends A{
	int d;
	void SetD() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter D : ");
		d = sc.nextInt();
	}
	void PutD() {
		System.out.println("D "+d);
	}
}

public class Hierarchy {
	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		c1.SetA();
		b1.SetB();
		c1.SetC();
		d1.SetD();
		c1.PutA();
		b1.PutB();
		c1.PutC();
		d1.PutD();
	}

}
