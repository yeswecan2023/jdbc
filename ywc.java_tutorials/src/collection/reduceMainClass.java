package collection;

import java.util.Arrays;
import java.util.List;

public class reduceMainClass {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(100,200,300);
		
		Integer result = num.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (c,e) -> c+e);
		
		// c carry
		// e element 
		// 0 starting
		
		
		System.out.println(result);

	}

}
