import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
class Staff {
    int id;
    String name;
    String location;
    double salary;
    Staff(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}
public class Functional_Interface1 {
    public static void main(String[] args) {
        List<Staff> list = Arrays.asList(
                new Staff(101, "A", "Pune", 50000),
                new Staff(102, "B", "Mumbai", 60000),
                new Staff(103, "C", "Delhi", 70000),
                new Staff(104, "D", "Hyderabad", 65000),
                new Staff(105, "E", "Chennai", 55000)
        );

        Function<Staff, String> getLocation = staff -> staff.location;

        List<String> locations = list.stream()
                .map(getLocation)
                .collect(Collectors.toList());

        System.out.println("Locations: " + locations);
    }
}
