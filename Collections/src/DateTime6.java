import java.time.LocalTime;
public class DateTime6{
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime before530 = now.minusHours(5).minusMinutes(30);
        System.out.println("Current Time: " + now);
        System.out.println("Time Before 5 Hours 30 Minutes: " + before530);
    }
}
