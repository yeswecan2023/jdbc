package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class mapFunctionMainClass {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(300,400,500,3);
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		Integer result = num.stream().filter(n ->n%2 == 0).map(f).reduce(0, (c,e)-> c+e);

		System.out.println(result);
	}

}
