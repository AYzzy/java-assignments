package CHAPTER4;

import java.util.Scanner;


public class question21 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int counter = 0;
            int largest = 0;

            System.out.println("Enter 10 integers:");

            while (counter < 10) {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                if (number > largest) {
                    largest = number;
                }

                counter++;
            }

            System.out.println("The largest number is " + largest);

        }


}
