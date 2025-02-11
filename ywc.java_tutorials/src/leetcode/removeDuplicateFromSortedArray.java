package leetcode;

public class removeDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] num = {0,0,1,2,2,3,3,3,4,4};
		int indexForNextNumber = 1;
		for (int i = 1; i < num.length; i++) {
			if (num[i] > num[i-1]) {
				num[indexForNextNumber] = num[i];
				indexForNextNumber++;
			}
		}
		for(int a : num) {
			System.out.print(a);
		}
	}

}
