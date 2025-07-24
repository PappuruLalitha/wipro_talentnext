import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
class Employee1 {
    int id;
    String name;
    double salary;
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
public class List7 {
    public static void main(String[] args) {
        Vector<Employee1> empVector = new Vector<>();
        empVector.add(new Employee1(101, "Alice", 50000));
        empVector.add(new Employee1(102, "Bob", 55000));
        empVector.add(new Employee1(103, "Charlie", 60000));
        System.out.println("Employees using Iterator:");
        Iterator<Employee1> it = empVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Employee1> en = empVector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}