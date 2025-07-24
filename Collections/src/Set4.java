import java.util.TreeSet;
import java.util.Iterator;
public class Set4 {
    private TreeSet<String> H1;
    public Set4() {
        H1 = new TreeSet<>();
    }
    public TreeSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null; // If not found
    }
    public static void main(String[] args) {
        Set4 cts = new Set4();
        cts.saveCountryNames("India");
        cts.saveCountryNames("USA");
        cts.saveCountryNames("Germany");
        cts.saveCountryNames("Canada");
        System.out.println("Countries in the TreeSet: " + cts.H1);
        String result1 = cts.getCountry("USA");
        System.out.println("Searching for 'Canada': " + (result1 != null ? "Found" : "Not Found"));
        String result2 = cts.getCountry("France");
        System.out.println("Searching for 'France': " + (result2 != null ? "Found" : "Not Found"));
    }
}