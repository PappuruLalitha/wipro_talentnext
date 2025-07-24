import java.util.*;
class Worker {
    int workerId;
    String name;
    int age;
    String location;
    public Worker(int workerId, String name, int age, String location) {
        this.workerId = workerId;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    public String toString() {
        return workerId + " - " + name + " - " + age + " - " + location;
    }
}
public class StreamAPI2 {
    public static void main(String[] args) {
        TreeMap<Integer, Worker> workerMap = new TreeMap<>();
        workerMap.put(1, new Worker(1, "Ravi", 25, "Pune"));
        workerMap.put(2, new Worker(2, "Anita", 30, "Delhi"));
        workerMap.put(3, new Worker(3, "Raj", 28, "Pune"));
        workerMap.put(4, new Worker(4, "Simran", 26, "Bangalore"));
        workerMap.put(5, new Worker(5, "Amit", 27, "Pune"));
        System.out.println("Workers from Pune:");
        for (Map.Entry<Integer, Worker> entry : workerMap.entrySet()) {
            if (entry.getValue().location.equalsIgnoreCase("Pune")) {
                System.out.println(entry.getValue());
            }
        }
    }
}