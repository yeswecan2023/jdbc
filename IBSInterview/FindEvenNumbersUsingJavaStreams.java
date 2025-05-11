package IBSInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersUsingJavaStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumber =  numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
