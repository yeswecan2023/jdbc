package ywc.java_tutorials;

class Aa extends Thread {
	public void run() {
		for(int i = 0; i < 50 ; i++) {
			System.out.println("Just Started");
		}
	}
}

class B extends Thread {
	public void run() {
		for(int i = 0; i < 50 ; i++) {
			System.out.println("Bye");
		}
	}
}

public class threadMainClass {

	public static void main(String[] args) {
		Aa a1 = new Aa();
		B b1 = new B();
		
		b1.setPriority(10);
		a1.setPriority(2);
		
		a1.start();
		b1.start();
	}

}
