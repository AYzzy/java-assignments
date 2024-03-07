package CHAPTER4;

import java.util.Scanner;

public class question23 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int counter = 0;
            int largest = 0;
            int secondLargest = 0;

            System.out.println("Enter 10 integers:");

            while (counter < 10) {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();

                if (number > largest) {
                    secondLargest = largest;
                    largest = number;
                } else if (number > secondLargest) {
                    secondLargest = number;
                }

                counter++;
            }

            System.out.println("The largest number is " + largest);
            System.out.println("The second largest number is " + secondLargest);



        }

}
