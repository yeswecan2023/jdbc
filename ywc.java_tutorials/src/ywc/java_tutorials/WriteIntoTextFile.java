package ywc.java_tutorials;

import java.io.FileWriter;

public class WriteIntoTextFile {

	public static void main(String[] args) {
		try {
//			FileWriter fw = new FileWriter("output.txt");
			FileWriter fw = new FileWriter("output.txt", true); // This will allow to keep existing text
//			fw.write("hello world");
			fw.append("---heyy--");
			fw.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Something has happened");
		}
	}

}
