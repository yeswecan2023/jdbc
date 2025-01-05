package ywc.java_tutorials;

class A2 implements Runnable {
	public void run() {
		System.out.println("Runnable");
	}
}

public class runnableThreadMainClass {

	public static void main(String[] args) {
		Runnable obj = new A2();
		Thread thread = new Thread(obj);
		thread.start();

	}

}
