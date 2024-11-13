// Given a list of names, use the Stream API to count the number of names starting with the letter "J".

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Chandramohan","Jane", "Jim","Shubam" ,"Jack","Ashish");

        long count=names.stream()
        .filter(p->p.startsWith("J"))
        .count();

        System.out.println(count);
    }
}
