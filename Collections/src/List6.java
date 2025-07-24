import java.util.Vector;
public class List6 {
    public static void main(String[] args) {
        Vector<Number> num = new Vector<>();
        num.add(25);         
        num.add(3.14f);
        num.add(123.456);   
        num.add(1000L);      
        System.out.println("Elements in the Vector:");
        for (Number numberList : num) {
            System.out.println(numberList);
        }
    }
}
