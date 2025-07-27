package mini_project;
import java.util.*;
class pack{
    char symbol;
    int number;
    public pack(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return symbol + " " + number;
    }
}
public class Collect_Group_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, List<Card>> cardMap = new HashMap<>();
        System.out.print("Enter Number of Cards : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();
            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(new Card(symbol, number));
        }
        List<Character> sortedSymbols = new ArrayList<>(cardMap.keySet());
        Collections.sort(sortedSymbols);
        for (char symbol : sortedSymbols) {
            List<Card> cards = cardMap.get(symbol);
            System.out.println("Cards of symbol " + symbol + " are:");
            int sum = 0;
            for (Card pack : cards) {
                System.out.println(pack.getSymbol() + " " + pack.getNumber());
                sum += pack.getNumber();
            }
            System.out.println("Number of cards: " + cards.size());
            System.out.println("Sum of Numbers: " + sum);
        }
        scanner.close();
    }
}
