package java_fundamentals;
import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Output: " + Arrays.toString(result));
    }
}