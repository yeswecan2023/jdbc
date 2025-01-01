package ywc.java_tutorials;

interface Printable {
	void display();
}

interface Showable {
	void display();
}

class C implements Printable, Showable {

	@Override
	public void display() {
		System.out.println("Class C");
	}
	
}

public class multipleInheritance {

	public static void main(String[] args) {
		C c1 = new C();
		c1.display();

	}

}
