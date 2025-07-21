import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class IO_Stream1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = sc.nextLine();
        System.out.print("Enter the character to be counted: ");
        char targetChar = sc.nextLine().toLowerCase().charAt(0); // Convert to lowercase
        int count = 0;
        try {
            FileReader fr = new FileReader(fileName);
            int data;
            while ((data = fr.read()) != -1) {
                char currentChar = Character.toLowerCase((char) data); // Convert each char to lowercase
                if (currentChar == targetChar) {
                    count++;
                }
            }
            fr.close();
            System.out.println("The file within single quote '" + fileName + "' has " + count + " instances of letter " + targetChar + ".");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
