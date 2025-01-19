package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class sortUsingSteam {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(500,100,200,300);
		
		Stream<Integer> sortedValues = num.stream().filter(n -> n%2 == 0).sorted();
		sortedValues.forEach(n -> System.out.println(n));
	}

}
