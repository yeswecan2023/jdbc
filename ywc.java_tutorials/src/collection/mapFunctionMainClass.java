package collection;

import java.util.Arrays;
import java.util.List;

public class mapFunctionMainClass {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(300,400,500,3);
		
		Integer result = num.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (c,e)-> c+e);

		System.out.println(result);
	}

}
