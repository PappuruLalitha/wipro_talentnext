import java.util.*;
import java.util.stream.*;
class Student {
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}
public class StreamAPI3{
    public static void main(String[] args) {
        Hashtable<Integer, Student> studentTable = new Hashtable<>();
        studentTable.put(101, new Student(101, "Amit", 45));
        studentTable.put(102, new Student(102, "Neha", 78));
        studentTable.put(103, new Student(103, "Ravi", 34));
        studentTable.put(104, new Student(104, "Sneha", 66));
        studentTable.put(105, new Student(105, "Vikram", 52));
        List<Student> passed = studentTable.values().stream()
            .filter(s -> s.marks >= 50)
            .collect(Collectors.toList());
        System.out.println("Students who passed (marks >= 50):");
        passed.forEach(System.out::println);
        System.out.println("Total passed students: " + passed.size());
    }
}
