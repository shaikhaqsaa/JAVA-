package com.core;
abstract class Abs{
	void meth1() {
		System.out.println("Meth1 ");
	}
	abstract void meth2();
}

class Abs1 extends Abs{
	void meth2() {
		System.out.println("Meth 2 define in Abs1");
	}
}
class Abs2 extends Abs1{
	void meth2() {
		System.out.println("Meth2 define in Abs2");
	}
}
public class Abstract {
	public static void main(String[] args) {
		Abs1 a1 = new Abs1();
		Abs2 a2 = new Abs2();
		
		a1.meth1();
		a1.meth2();
		
		a2.meth1();
		a2.meth2();
	}


}
