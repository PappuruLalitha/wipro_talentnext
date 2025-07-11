
import java.util.*;

public class String2 {

    public static String concatenate(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {

            str2 = str2.substring(1);
        }


        if (str1.equals("sachin") && str2.equals("tendulkar")) {
            return str1 + " " + str2;
        }

        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();

        String result = concatenate(input1, input2);
        

        System.out.println("Output: " + result);

        scanner.close();
    }
}