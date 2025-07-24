interface DigitCounter {
    int count(int n);
}
class NumberUtil {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}
public class Method_Reference2 {
    public static void main(String[] args) {
        DigitCounter counter = NumberUtil::digitCount;

        int result = counter.count(548962);
        System.out.println("Digit count of 548962 is: " + result);
    }
}
