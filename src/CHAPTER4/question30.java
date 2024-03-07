package CHAPTER4;

import java.util.Scanner;

public class question30 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter base length (from 1 and 10): ");
            int base = scanner.nextInt();

            if (base < 1 || base > 10) {
                System.out.println("Invalid input. Base length must be between 1 and 10.");
            } else {

                for (int i = 1; i <= base; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }


}
