//Given a list of strings, use the Stream API to find the longest string.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class MaxLength {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("chandramohan","shubam","ashish","venkatesh","varun","pramod");

        Optional<String> longestString=list.stream()
        .max(Comparator.comparingInt(String::length));
        
        System.out.println(longestString);
    }
}
