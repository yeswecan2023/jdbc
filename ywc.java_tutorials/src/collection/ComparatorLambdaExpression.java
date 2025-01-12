package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	int age;
	String name;
	
	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}
	
	public Student2(int age, String name) {
		this.age = age;
		this.name = name;
	}
}


public class ComparatorLambdaExpression {

	public static void main(String[] args) {
		
		Comparator<Student2> com = (Student2 i, Student2 j) -> i.age > j.age ? 1 : -1;
		
		List<Student2> stu = new ArrayList<Student2>();
		stu.add(new Student2(12, "sdfsdf"));
		stu.add(new Student2(30, "liuyoui"));
		stu.add(new Student2(18, "sreter"));
		
		Collections.sort(stu,com);
		for(Student2 s : stu) {
			System.out.println(s);
		}
	}

}
