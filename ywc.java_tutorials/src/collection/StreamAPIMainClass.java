package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIMainClass {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(321,54,2,854,320);
		Stream<Integer> s1 = nums.stream();
		
		//s1.forEach(n -> System.out.println(n));
		
		Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
		Stream<Integer> s3 = s2.map(n -> n*2);
		s3.forEach(n -> System.out.println(n));
	}

}
