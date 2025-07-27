package mini_project;
import java.util.*;
class Box {
    double length, width, height;
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getVolume() {
        return length * width * height;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;
        return Double.compare(this.getVolume(), other.getVolume()) == 0;
    }
    public int hashCode() {
        return Objects.hash(Math.round(getVolume() * 100.0) / 100.0);
    }
    public String toString() {
        return String.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f", 
            length, width, height, getVolume());
    }
}
public class SetBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Box> boxSet = new LinkedHashSet<>();
        System.out.print("Enter the number of Box: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter Width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter Height: ");
            double height = scanner.nextDouble();
            boxSet.add(new Box(length, width, height));
        }
        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.println(box);
        }
        scanner.close();
    }
}
