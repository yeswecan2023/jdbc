package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListNewAndForloop {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(4,5,8,6,7,2);
		num.forEach(n -> System.out.println(n));
	}

}
