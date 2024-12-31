package ywc.java_tutorials;

abstract class Vehicle{
	abstract void speed();
}

class Bike extends Vehicle {
	void speed() {
		System.out.println("55km/hr");
	}
}

public class abstractMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.speed();
	}

}
