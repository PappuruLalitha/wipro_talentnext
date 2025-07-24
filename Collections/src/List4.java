import java.util.ArrayList;
public class List4 {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(10);          
        numberList.add(15.5f);      
        numberList.add(99.99);       
        numberList.add(100L);  
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
