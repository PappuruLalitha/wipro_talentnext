import java.time.LocalDate;
import java.time.Period;
public class DateTime3 {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2020, 6, 1); // Example joining date
        LocalDate currentDate = LocalDate.now();
        Period experience = Period.between(joiningDate, currentDate);
        System.out.println("Experience: " +
                experience.getYears() + " years, " +
                experience.getMonths() + " months, " +
                experience.getDays() + " days");
    }
}
