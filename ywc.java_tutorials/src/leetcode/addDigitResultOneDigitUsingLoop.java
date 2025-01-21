package leetcode;

public class addDigitResultOneDigitUsingLoop {

	public static void main(String[] args) {
		Integer num = 9;
		Integer sumValue = 0;
		while (num > 0 || sumValue > 9) {
			
			if (num == 0) {
				num =sumValue;
				sumValue = 0;
			}
			if(sumValue != 0 ) {
				sumValue =  sumValue + (num %10);
			} else {
				sumValue = num%10;
			}
			num = (int)num/10;
		}
		System.out.println(sumValue);
		
	}

}
