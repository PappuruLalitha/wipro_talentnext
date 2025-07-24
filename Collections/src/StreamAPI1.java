import java.util.*;
import java.util.stream.Collectors;
public class StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, -2, -3, -4, 5, 7, -6, 9);
        List<Integer> result = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Filtered Negative Even Numbers: " + result);
    }
}
