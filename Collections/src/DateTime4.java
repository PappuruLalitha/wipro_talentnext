import java.time.Year;
public class DateTime4 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        if (Year.isLeap(currentYear)) {
            System.out.println(currentYear + " is a Leap Year");
        } else {
            System.out.println(currentYear + " is not a Leap Year");
        }
    }
}
