package mini_project;
import java.util.*;
public class StringOperation {
    public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> resultList = new ArrayList<>();
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        resultList.add(op1.toString());
        int firstIdx = s1.indexOf(s2);
        int lastIdx = s1.lastIndexOf(s2);
        if (firstIdx != -1 && lastIdx != -1 && firstIdx != lastIdx) {
            StringBuilder reversedS2 = new StringBuilder(s2).reverse();
            String replaced = s1.substring(0, lastIdx) + reversedS2 + s1.substring(lastIdx + s2.length());
            resultList.add(replaced);
        } else {
            resultList.add(s1 + s2);
        }
        if (firstIdx != -1 && lastIdx != -1 && firstIdx != lastIdx) {
            String deleted = s1.substring(0, firstIdx) + s1.substring(firstIdx + s2.length());
            resultList.add(deleted);
        } else {
            resultList.add(s1);
        }
        int mid = s2.length() / 2;
        if (s2.length() % 2 != 0) mid++;
        String s2FirstHalf = s2.substring(0, mid);
        String s2SecondHalf = s2.substring(mid);
        resultList.add(s2FirstHalf + s1 + s2SecondHalf);
        Set<Character> s2Chars = new HashSet<>();
        for (char c : s2.toCharArray()) {
            s2Chars.add(c);
        }
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2Chars.contains(c)) {
                op5.append('*');
            } else {
                op5.append(c);
            }
        }
        resultList.add(op5.toString());

        return resultList;
    }
    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";
        ArrayList<String> result = performOperations(s1, s2);
        System.out.println("Output: " + result);
    }
}
