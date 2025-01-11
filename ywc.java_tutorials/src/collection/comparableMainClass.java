package collection;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
	int age;
	String name;
	
	
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class comparableMainClass {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student(20, "asdfasd"));
		stu.add(new Student(25, "dfawer"));
		stu.add(new Student(25, "fghjfgyh")); 
		
		System.out.println(stu);
		for(Student s: stu) {
			System.out.println(s);
		}
	}

}
