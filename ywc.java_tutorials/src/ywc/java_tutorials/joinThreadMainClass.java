package ywc.java_tutorials;

class A1 extends Thread {
	int j = 0;
	public void run() {
		for (int i = 0; i <=50; i++) {
			j = i;
		}
	}
}

public class joinThreadMainClass {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.start();
		try {
		a1.join();
		} catch (Exception e) {
			System.out.println("Error occurred ");
		}
		System.out.println(a1.j);
	}

}
