import java.util.*;
public class Lambda_Expression2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fish", "goat", "hat", "ice", "jungle");
        System.out.println("Original List: " + words);
        System.out.println("Reversed Strings:");
        words.forEach(str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println(reversed);
        });
    }
}
