package ywc.java_tutorials;

public class Teacher {

	String myname;
	
	Teacher() {
		
	}
	
	void display(String myname) {
		this.myname = myname;
	}
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.display("mark");
		System.out.println(t1.myname);
	}

}
