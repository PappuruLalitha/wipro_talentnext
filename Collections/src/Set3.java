import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;
public class Set3 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("Canada");
        NavigableSet<String> reversedCountries = countries.descendingSet();
        System.out.println("a) Countries in reverse order:");
        for (String country : reversedCountries) {
            System.out.println(country);
        }
        System.out.println("\nb) Iterating with Iterator:");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String search = "Germany";
        if (countries.contains(search)) {
            System.out.println("\nc) '" + search + "' exists in the TreeSet.");
        } else {
            System.out.println("\nc) '" + search + "' does not exist in the TreeSet.");
        }
    }
}
