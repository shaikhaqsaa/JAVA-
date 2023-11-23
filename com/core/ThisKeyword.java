package com.core;
class Student{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default constructor");
	}
	public Student(int rno, String sname) {
		this();
		this.rno = rno;
		this.sname = sname;
		System.out.println("ROLL NO : "+rno);
		System.out.println("Name : "+sname);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		Student s1 = new Student(1, "aqsa");
	}
	

}
