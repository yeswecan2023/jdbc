package ywc.java_tutorials;

class Dad {
	int money = 20000;
}


class Son extends Dad {
	int price = 10;
}


public class MainClass {

	public static void main(String[] args) {
		Son son =new Son();
		System.out.println(son.money);

	}

}
