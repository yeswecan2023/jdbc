package leetcode;

public class binaryNumberWithAlternativeBit {

	public static void main(String[] args) {
		int num = 10;
		int xor = num ^ (num>>1);
		if(((xor+1) & xor) == 0) {
			System.out.println(" true ");
		} else {
			System.out.println(" false ");
		}
		

	}

}
 