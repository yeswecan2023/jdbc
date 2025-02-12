package leetcode;

public class PrintNameWithoutLoop {

	public static void main(String[] args) {
		String name = "Vishnu";
		String number = "0";
		
		number = number.replaceAll("0", "0000000000");
		name = number.replaceAll("0", name + "\n");
		System.out.println(name);
	}

}
