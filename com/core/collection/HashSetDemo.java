package com.collection;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(10);
	hs.add("aqsa");
	hs.add(null);
	hs.add(false);
	
	System.out.println(hs);
	System.out.println(hs.isEmpty());
}

}
