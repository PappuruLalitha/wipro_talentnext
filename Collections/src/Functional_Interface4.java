import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Emp {
    private int id;
    private String name;
    private double salary;
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
public class Functional_Interface4 {
    public static void main(String[] args) {
        List<Emp> emps = Arrays.asList(
                new Emp(1, "Ajay", 9500),
                new Emp(2, "Neha", 12000),
                new Emp(3, "Raj", 8700),
                new Emp(4, "Sneha", 15000),
                new Emp(5, "Kiran", 9900)
        );

        Predicate<Emp> lowSalary = emp -> emp.getSalary() < 10000;

        List<String> result = emps.stream()
                .filter(lowSalary)
                .map(Emp::getName)
                .collect(Collectors.toList());

        System.out.println("Employees with salary < 10000: " + result);
    }
}
