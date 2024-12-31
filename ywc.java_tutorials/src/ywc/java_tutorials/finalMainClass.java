package ywc.java_tutorials;

class Parent {
	final void display() {
		System.out.println("123");
	}
}

class Child extends Parent {
//	void display() { // not possible to over ride
//		System.out.println("234");
//	}
}

final class A {
	
}

//class B extends A {
//	Not possible
//}

public class finalMainClass {

	public static void main(String[] args) {
		final int a = 10;
		// a = 20; not possible
		System.out.println(a);
		
		Child child = new Child();
		child.display();
		
	}

}
