package com.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Aqsa");
		System.out.println(t);
		t.setPriority(3);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(5000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("exit");
	}
}