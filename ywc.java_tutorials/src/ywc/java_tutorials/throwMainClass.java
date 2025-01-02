package ywc.java_tutorials;

class Cal {
	void div() throws Exception {
		int a = 10/0;
	}
		
}

public class throwMainClass {

	public static void main(String[] args) {
		
		Cal cal = new Cal();
		try {
			cal.div();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
