package ywc.java_tutorials;

interface playable {
	void play();
}

class Guitar implements playable{

	@Override
	public void play() {
		System.out.println("Play Guitar");
		
	}
	
}

class Piano implements playable{

	@Override
	public void play() {
		System.out.println("Play Piano");
		
	}
	
}

public class inheritanceMainClass {
	public static void main(String[] args) {
		Guitar guitar = new Guitar();
		guitar.play();
		Piano piano = new Piano();
		piano.play();
	}
}
