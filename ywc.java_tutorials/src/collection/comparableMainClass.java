package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
	int age;
	String name;
	public Student1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 that) {
		if(this.age > that.age) {
			return 1;
		} else {
			return -1;
		}
	}
}


public class comparableMainClass {

	public static void main(String[] args) {
		List<Student1> stu = new ArrayList<Student1>();
		stu.add(new Student1(20, "asdfasd"));
		stu.add(new Student1(30, "dfawer"));
		stu.add(new Student1(25, "fghjfgyh")); 
		Collections.sort(stu);
		for(Student1 s: stu) {
			System.out.println(s);
		}
	}

}
