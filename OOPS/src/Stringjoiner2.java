import java.util.StringJoiner;

public class Stringjoiner2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Kolkata");
        StringJoiner merged1 = new StringJoiner("-");
        merged1.merge(s2); 
        merged1.merge(s1); 
        System.out.println("s1 merged to s2: " + merged1);
        StringJoiner merged2 = new StringJoiner("-");
        merged2.merge(s1); 
        merged2.merge(s2); 
        System.out.println("s2 merged to s1: " + merged2);
    }
}