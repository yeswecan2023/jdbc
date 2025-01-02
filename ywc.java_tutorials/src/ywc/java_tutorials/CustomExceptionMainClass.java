package ywc.java_tutorials;

import java.util.Scanner;
class NotValidException extends Exception {
	public NotValidException(String s) {
		super(s);
	}
}

public class CustomExceptionMainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int age = scan.nextInt();
			if(age < 18 ) {
				throw new NotValidException("Your age should be above 18");
			}
		} catch (NotValidException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
