package com.core;

public class StaticMethod {
	static int a = 10;
	static int  b;
	{
		System.out.println("block1 ");
	}
	public static void meth(int x) {
		System.out.println("A :"+a);
		System.out.println("B : "+b);
		System.out.println("X : "+x);
	}
	static {
		System.out.println("Static block");
		b = a*4;
	}
	public static void main(String[] args) {
		meth(12);
		StaticMethod s = new StaticMethod();
	}
	public StaticMethod() {
		System.out.println("default constructor");
	}
	{
		System.out.println("block 2");
	}
	
}
