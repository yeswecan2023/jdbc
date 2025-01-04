package ywc.java_tutorials;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMainClass {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("output1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hey man");
			bw.newLine();
			bw.write("Ok");
			bw.close();
			System.out.println(" Success ");
		} catch (Exception e) {
			System.out.println("Something has happened");
		}

	}

}
