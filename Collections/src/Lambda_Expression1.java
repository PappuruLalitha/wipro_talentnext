import java.util.*;
import java.util.stream.*;
public class Lambda_Expression1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }
        System.out.println("Random Numbers: " + numbers);
        System.out.println("Prime Numbers:");
        numbers.stream().filter(n -> isPrime(n)).forEach(System.out::println);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).allMatch(i -> n % i != 0);
    }
}
