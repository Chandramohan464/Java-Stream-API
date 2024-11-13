// Given a list of integers, use the Stream API to find the sum of all even numbers.

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(23,34,56,45,7,18,101);

        int sumOfEven=numbers.stream()
        .filter(n->n%2==0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("Sum of Even Numbers: "+sumOfEven);
    }
}
