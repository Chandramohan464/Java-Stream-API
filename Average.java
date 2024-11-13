//Use the Stream API to find the average of a list of double values.
import java.util.List;
import java.util.OptionalDouble;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        List<Double> list=Arrays.asList(23.34,45.87,18.9,7.08,99.99);

        OptionalDouble average = list.stream()
                                        .mapToDouble(Double::doubleValue)
                                        .average();

        System.out.println("Average: "+average);
    }
}
