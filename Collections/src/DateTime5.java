import java.time.LocalTime;
public class DateTime5{
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime after25Min = now.plusMinutes(25);
        System.out.println("Current Time: " + now);
        System.out.println("Time After 25 Minutes: " + after25Min);
    }
}
