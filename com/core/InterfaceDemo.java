package com.core;
interface igs1{
	void meth1();
}
interface igs2 extends igs1{
	void meth2();
}

public class InterfaceDemo implements igs2 {
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
public static void main(String[] args) {
	InterfaceDemo i = new InterfaceDemo();
	i.meth1();
	i.meth2();
}
}
