package ywc.java_tutorials;

public class Student {

	int marks;
	String name;
	
	Student(int a, String b) {
		marks = a;
		name = b;
	}
	
	public static void main(String[] args) {
		Student ob1 = new Student(32, "Vish");
		
		
		System.out.println(ob1.marks);
		System.out.println(ob1.name);
	}

}
