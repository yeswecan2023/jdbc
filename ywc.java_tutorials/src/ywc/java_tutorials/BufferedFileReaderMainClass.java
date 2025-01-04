package ywc.java_tutorials;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedFileReaderMainClass {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("output.txt");
		BufferedReader br = new BufferedReader(fr);
		String l = br.readLine();
		while(l != null ) {
			System.out.println(l);
			l = br.readLine();
		}
		br.close();
		} catch (Exception e) {
			System.out.println("Something has happened");
		}

	}

}
