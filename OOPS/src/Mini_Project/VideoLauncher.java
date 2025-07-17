package Mini_Project;

import Mini_Project.Video;
import Mini_Project.VideoStore;
import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice(1 to 6): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String nameToAdd = scanner.nextLine();
                    store.addVideo(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String nameToCheckout = scanner.nextLine();
                    store.doCheckout(nameToCheckout);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String nameToReturn = scanner.nextLine();
                    store.doReturn(nameToReturn);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String nameToRate = scanner.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    store.receiveRating(nameToRate, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Thank you for using the Video Store Inventory System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 1 to 6.");
            }

        } while (choice != 6);

        scanner.close();
    }
}