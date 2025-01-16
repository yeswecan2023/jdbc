package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterPredicateMainClass {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(100,200,300,600);
		
		Predicate<Integer> p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		int result = nums.stream()
				.filter(p)
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+e);
		System.out.println(result);
	}

}
