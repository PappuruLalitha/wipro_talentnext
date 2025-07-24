import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
public class DateTime2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        YearMonth nextMonth = YearMonth.from(today.plusMonths(1));
        LocalDate firstDay = nextMonth.atDay(1);
        int sundayCount = 0;
        LocalDate secondSunday = null;
        for (int i = 0; i < 15; i++) {
            LocalDate currentDay = firstDay.plusDays(i);
            if (currentDay.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    secondSunday = currentDay;
                    break;
                }
            }
        }
        System.out.println("Second Sunday of Next Month: " + secondSunday);
    }
}
