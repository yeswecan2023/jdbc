package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIMainClass {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(20,452,6543,212,54);
		Stream<Integer> s1 =  nums.stream();
		
		
		s1.forEach(n -> System.out.println(n));
		

	}

}
