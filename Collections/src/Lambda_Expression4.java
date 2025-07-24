interface WordCount {
    int count(String str);
}
public class Lambda_Expression4 {
    public static void main(String[] args) {
        WordCount wc = (str) -> str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
        String input = "Lambda expressions in Java are powerful and concise";
        int wordCount = wc.count(input);
        System.out.println("Input: " + input);
        System.out.println("Word Count: " + wordCount);
    }
}
