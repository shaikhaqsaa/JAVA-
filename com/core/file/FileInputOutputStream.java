package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("tops2.txt");
		String s = "THIS FILE IS DEMO OF INPUT/OUTPUT STREAM";
				byte b[]= s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written Successfully!!");
		
		FileInputStream fis = new FileInputStream("tops2.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
	

}
