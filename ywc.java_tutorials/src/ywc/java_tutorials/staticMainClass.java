package ywc.java_tutorials;

class Studnet {
	int mark = 0;
	static String teacher = "Pri";
	
	static void display() {
		System.out.println("Hello");
	}
}


public class staticMainClass {

	public static void main(String[] args) {
		Studnet s1 = new Studnet();
		s1.mark = 67;
		Studnet s2 = new Studnet();
		s2.mark = 67;
		System.out.println(Studnet.teacher);
		Studnet.teacher = "Vis";
		System.out.println(Studnet.teacher);
		Studnet.display();
	}

}
