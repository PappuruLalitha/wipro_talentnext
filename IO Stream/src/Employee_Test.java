import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Employee_Test {
    public static void main(String[] args) {
        Employee emp = new Employee("Lalitha" ,new Date(), "CSE", "Developer", 50000.0);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
