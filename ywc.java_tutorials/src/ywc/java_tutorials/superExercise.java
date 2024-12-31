package ywc.java_tutorials;

class Person {
	String name;
	Person(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}

class Employee extends Person {
	Employee(String name) {
		super(name);
	}
}

public class superExercise {

	public static void main(String[] args) {
		Employee employee = new Employee("John");
	}

}
