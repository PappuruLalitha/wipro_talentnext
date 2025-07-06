package java_fundamentals;
import java.util.Arrays;
public class Arrays12 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6} };

        int[] result = new int[2];
        result[0] = arr[0][arr[0].length / 2]; 
        result[1] = arr[1][arr[1].length / 2]; 

        System.out.println("Output: " + Arrays.toString(result));
    }
}
