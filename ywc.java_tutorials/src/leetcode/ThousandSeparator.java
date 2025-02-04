package leetcode;

public class ThousandSeparator {

	public static void main(String[] args) {
		int number = 1000;
		
		String result = "";
		int total = 0;
		while (number > 0) {
			int lastNumber = number%10;
			number = number/10;
			result = lastNumber+result;
			total++;
			
			if (total == 3 && number > 0) {
				result = "."+result;
				total = 0;
			}
		}
		System.out.println(result);

	}

}
