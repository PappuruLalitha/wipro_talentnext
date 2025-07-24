import java.util.*;
import java.util.function.Consumer;
public class Functional_Interface7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 7, 8, 9, 10, 11, 12);
        Consumer<Integer> printOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + "-> even");
            else
                System.out.println(n + "-> odd");
        };
        numbers.forEach(printOddEven);
    }
}
