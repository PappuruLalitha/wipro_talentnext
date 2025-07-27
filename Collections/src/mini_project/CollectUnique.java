package mini_project;
import java.util.*;
class Card {
    char symbol;
    int number;
    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getNumber() {
        return number;
    }
}
public class CollectUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> uniqueSymbols = new HashSet<>();
        List<Card> cardList = new ArrayList<>();
        while (uniqueSymbols.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();
            if (!uniqueSymbols.contains(symbol)) {
                uniqueSymbols.add(symbol);
                cardList.add(new Card(symbol, number));
            }
        }
        System.out.println("Four symbols gathered in " + (cardList.size() + (scanner.hasNextLine() ? 0 : (4 - uniqueSymbols.size()))) + " cards.");
        System.out.println("Cards in Set are :");
        cardList.sort(Comparator.comparing(Card::getSymbol));
        for (Card card : cardList) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }
        scanner.close();
    }
}
