package com.core;

class f1{
	final int a;
	public f1() {
		a = 10;
	}
	void show() {
		System.out.println("A : "+a);
		System.out.println("show from f1");
	}
}
class f2 extends f1{
	void show() {
		super.show();
		System.out.println("show from f2");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		f2 f = new f2();
		f.show();
	}
	

}
