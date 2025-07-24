import java.util.*;
import java.util.function.Function;
public class Functional_Interface2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        Function<List<Integer>, Integer> sumFunction = list -> list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sumFunction.apply(numbers));
    }
}
