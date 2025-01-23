package leetcode;

public class powerOfFour {

	public static void main(String[] args) {
		int num = 256;
		if(num <= 0) {
			System.out.println("False");
		} else if (num == 1 ) {
			System.out.println(" True");
		} else if (1073741824 % num == 0 && (num % 10 == 4 || num % 10 == 6)) {
			System.out.println(" True "); 
		} else {
			System.out.println(" false ");
		}

	}

}
