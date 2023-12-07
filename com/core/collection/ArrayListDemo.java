package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("aqsa");
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		
		
		Iterator itr = al.iterator();
		System.out.println("-------------");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			ListIterator litr = al.listIterator();
			System.out.println("-------------------");
			while(litr.hasNext()) {
				System.out.println(litr.next()+"aqsa");
				
				litr = al.listIterator();
				System.out.println("--------");
				while(litr.hasPrevious()) {
					System.out.println(litr.previous());
				}
				
			}
		}
		
	}
	

}
