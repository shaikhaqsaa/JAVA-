package com.core;

interface ifs1{
	void meth1();
}
interface ifs2{
	void meth2();
}

public class Interface implements ifs1,ifs2 {
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public static void main(String[] args) {
		Interface i = new Interface();
		
		i.meth1();
		i.meth2();
	}
	

}
