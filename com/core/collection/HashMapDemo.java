package com.collection;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(987, "sayyed");
	hm.put(234, "aqsa");
	hm.put(231, "munib");
	
	System.out.println(hm);
	System.out.println(hm.get(234));
}

}
