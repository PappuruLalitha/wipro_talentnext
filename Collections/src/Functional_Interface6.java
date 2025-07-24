import java.util.*;
import java.util.function.Consumer;
public class Functional_Interface6 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("hello", "world", "java", "stream", "lambda", "consumer", "reverse", "update", "palindrome", "example"));
        Consumer<List<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };
        reverseWords.accept(words);
        System.out.println("Reversed words: " + words);
    }
}
