package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}


public class sortStringMainClass {

	public static void main(String[] args) {
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age > j.age) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(21, "Nan"));
		stud.add(new Student(12, "Jas"));
		stud.add(new Student(23, "Jok"));
		stud.add(new Student(78, "Tom"));
		
		Collections.sort(stud, com);
		
		for ( Student s : stud) {
			System.out.println(s);
		}
		
	}

}
