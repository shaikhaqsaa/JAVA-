package com.core;
class x1{
	void show() {
		System.out.println("show from x1");
	}
}
	
	class x2 extends x1{
		void show() {
			System.out.println("show from x2");
			
		}
	}

public class ExceptionOverride {
	public static void main(String[] args) {
		x2 x = new x2();
		x.show();
	}

}
