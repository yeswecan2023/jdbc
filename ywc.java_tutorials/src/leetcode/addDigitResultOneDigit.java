package leetcode;

public class addDigitResultOneDigit {

	public static void main(String[] args) {
		int num = 99;
		
		if(num < 9 ) {
			System.out.println(num);
		} else if (num % 9 == 0) {
			System.out.println(9);
		} else {
			System.out.println(num % 9);
		}

	}

}
