package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("tops4.txt");
	String s = "this is demo file";
	fw.write(s);
	fw.flush();
	fw.close();
	System.out.println("file written successfulle");
	
	FileReader fr = new FileReader("tops4.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	fr.close();
}	

}
