package com.core;

import java.util.Scanner;

public class VowelConsonent {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Alphabet : ");
		ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
			System.out.println(ch+  " is  vowel ");
			
		}else {
			System.out.println(ch+ " is consonent");
		}
	}

}
