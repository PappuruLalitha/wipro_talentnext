import java.util.ArrayList;
import java.util.Iterator;
public class List3 {
    private ArrayList<String> stringList;
    public List3() {
        stringList = new ArrayList<>();
    }
    public void addString(String str) {
        stringList.add(str);
    }
    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        List3 str = new List3();
        str.addString("Java");
        str.addString("Spring Boot");
        str.addString("SQL");
        str.addString("Full Stack");
        str.printAll();
    }
}
