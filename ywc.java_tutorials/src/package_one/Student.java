package package_one;

import package_two.TeacherTwo;

public class Student {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher.salary); 
		
		TeacherTwo teacherTwo = new TeacherTwo();
		System.out.println("Teacher two " + teacherTwo.salarytwo); 
		
	}
}
