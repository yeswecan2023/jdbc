package collection;

import java.util.HashSet;
import java.util.Set;

public class hashSetMainClass {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.add(20);
		num.add(10);
		for (Integer n : num) {
			System.out.println(n);
		}
	}

}
