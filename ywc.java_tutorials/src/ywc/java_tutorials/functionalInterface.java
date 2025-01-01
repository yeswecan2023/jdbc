package ywc.java_tutorials;

interface D {
	void display();
}

public class functionalInterface {
	public static void main (String[] args) {
		D obj = new D() {
			public void display() {
				System.out.println("This is display method");
			}
		};
		obj.display();
		
		D obj1 = ()-> {
			System.out.println("This is display method1");
		};
		obj1.display();
	}
}
