import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Functional_Interface5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 4, 6, 9, 16, 20, 25, 30);
        Predicate<Integer> isPerfectSquare = n -> Math.sqrt(n) % 1 == 0;
        List<Integer> result = numbers.stream()
                .filter(isPerfectSquare)
                .collect(Collectors.toList());

        System.out.println("Perfect square numbers: " + result);
    }
}
