package com.core;
interface iss1
{
	static void meth1() 
	{
		System.out.println(" meth1 define by using static ");
	}
	
}
interface iss2 extends iss1{
	void meth2();
}

public class InterfaceStatic implements iss2 {
	public void meth2() {
		System.out.println("meth2");
	}
	public static void main(String[] args) {
		InterfaceStatic i = new InterfaceStatic();
		iss1.meth1();
		i.meth2();
	}

}
