import java.util.HashSet;
import java.util.Iterator;
public class Set1 {
    private HashSet<String> H1;
    public Set1() {
        H1 = new HashSet<>();
    }
    public HashSet<String> saveCountryNames(String CountryName) {
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
        return null;
    }
    public static void main(String[] args) {
        Set1 cs = new Set1();
        cs.saveCountryNames("India");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Germany");
        System.out.println("Countries in the HashSet: " + cs.H1);
        String searchResult1 = cs.getCountry("USA");
        System.out.println("Search for 'USA': " + (searchResult1 != null ? "Found" : "Not Found"));
        String searchResult2 = cs.getCountry("France");
        System.out.println("Search for 'France': " + (searchResult2 != null ? "Found" : "Not Found"));
    }
}
