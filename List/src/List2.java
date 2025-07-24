public class List2 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();
        db.addEmployee(new Employee(101, "Alice", "alice@example.com", "Female", 50000));
        db.addEmployee(new Employee(102, "Bob", "bob@example.com", "Male", 60000));
        db.addEmployee(new Employee(103, "Charlie", "charlie@example.com", "Male", 55000));
        System.out.println(db.showPaySlip(102));
        System.out.println("\nAll Employees:");
        db.displayAllEmployees();
        db.deleteEmployee(102);
        System.out.println("\nAfter deletion of Employee ID 102:");
        db.displayAllEmployees();
    }
}
