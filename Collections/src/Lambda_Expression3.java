import java.util.*;
public class Lambda_Expression3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "cat", "delta", "eagle", "fish", "go", "hat", "ice", "jungle");
        System.out.println("Strings with Odd Length:");
        words.stream().filter(s -> s.length() % 2 != 0).forEach(System.out::println);
    }
}
