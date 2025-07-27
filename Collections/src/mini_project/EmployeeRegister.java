package mini_project;
import java.util.*;
public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");

            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            Employee emp = new Employee(firstName, lastName, mobile, email, address);
            employees.add(emp);
        }

        // Sort by First Name
        employees.sort(Comparator.comparing(Employee::getFirstName));

        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
            "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        for (Employee emp : employees) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                emp.getFirstName(), emp.getLastName(), emp.getMobile(), emp.getEmail(), emp.getAddress());
        }

        sc.close();
    }
}
