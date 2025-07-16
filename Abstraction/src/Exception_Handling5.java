import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Exception_Handling5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            String ageInput = scanner.nextLine();
            int age;

            try {
                age = Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Age must be a number.");
                return;
            }

            // Validate age range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be between 18 and 59.");
            }

            // If everything is valid
            System.out.println("Hello " + name + "! Your age " + age + " is valid.");

        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
