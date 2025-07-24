import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Functional_Interface3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "racecar", "hello", "level", "world", "noon", "java", "civic", "python", "radar");
        Predicate<String> isPalindrome = word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
        List<String> result = words.stream()
                .filter(isPalindrome)
                .collect(Collectors.toList());
        System.out.println("Palindrome words: " + result);
    }
}
