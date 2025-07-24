import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDB {
    ArrayList<Employee> employeeList = new ArrayList<>();
    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }
    public boolean deleteEmployee(int employeeId) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.empId == employeeId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public String showPaySlip(int employeeId) {
        for (Employee emp : employeeList) {
            if (emp.empId == employeeId) {
                return "Pay slip for Employee ID " + employeeId + ": Salary is " + emp.salary;
            }
        }
        return "Employee not found!";
    }
    public void displayAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the database.");
        } else {
            for (Employee emp : employeeList) {
                emp.printEmployeeDetails();
            }
        }
    }
}