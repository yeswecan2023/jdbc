package ywc.java_tutorials;

import java.io.FileReader;

public class FileReaderMainClass {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("output.txt");
		int r = fr.read();
		while (r != -1) {
			System.out.print((char)r);
			r = fr.read();
		}
		fr.close();
		} catch (Exception e) {
			System.out.println("Something has happened");
		}

	}

}
