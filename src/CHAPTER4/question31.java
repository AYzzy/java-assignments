package CHAPTER4;

import java.util.Scanner;

public class question31 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a five-digit integer: ");
            int number = scanner.nextInt();

            if (number < 10000 || number > 99999) {
                System.out.println("Error: Please enter a valid five-digit integer.");
            } else {
                    System.out.println("The number " + number + " is a palindrome.");
            }
        }


}
