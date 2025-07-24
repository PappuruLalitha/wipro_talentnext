import java.util.LinkedList;
public class List5 {
    public static void main(String[] args) {
        LinkedList<Number> numberList = new LinkedList<>();
        numberList.add(25);        
        numberList.add(3.14f);      
        numberList.add(123.456);    
        numberList.add(1000L);   
        System.out.println("Elements in the LinkedList:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
