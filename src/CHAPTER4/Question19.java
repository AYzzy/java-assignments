package CHAPTER4;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                double Salary = 200.0;
                double commission = 0.09;
                double total = 0.0;


                System.out.print("Enter value of items sold (enter -1 to finish): ");
                double itemValue = scanner.nextDouble();

                while (itemValue != -1) {
                    total += itemValue;
                    System.out.print("Enter the next item value (enter -1 to finish): ");
                    itemValue = scanner.nextDouble();
                }

                double commissioning = total * commission;
                double totalEarnings = Salary + commissioning;

                System.out.printf("Total sales: $%.2f%n", total);
                System.out.printf("Commission: $%.2f%n", commissioning);
                System.out.printf("Total earnings: $%.2f%n", totalEarnings);


            }




}
