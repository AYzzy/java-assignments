package CHAPTER4;
import java.util.Scanner;
public class question24 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Choose an option:");
                System.out.println("1. Option 1");
                System.out.println("2. Option 2");
                System.out.print("Enter your choice (1 or 2): ");
                choice = scanner.nextInt();

                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                }
            } while (choice != 1 && choice != 2);


            if (choice == 1) {
                System.out.println("You selected Option 1.");

            } else {
                System.out.println("You selected Option 2.");

            }

        }


}
