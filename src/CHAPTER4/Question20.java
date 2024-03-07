package CHAPTER4;

import java.util.Scanner;

public class Question20 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double lowTaxRate = 0.15;
            double highTaxRate = 0.20;
            double earning = 30000.0;


            System.out.print("Enter the number of citizens: ");
            int number = scanner.nextInt();


            for (int count = 1;count <= number; count++) {
                System.out.print("Enter income for citizen " + count + ": $");
                double income = scanner.nextDouble();

                double tax;
                if (income <= earning) {
                    tax = income * lowTaxRate;
                } else {
                    tax = earning * lowTaxRate + (income - earning) * highTaxRate;
                }


                System.out.printf("Citizen %d - Earnings: $%.2f, Tax: $%.2f%n",count, income, tax);
            }


        }


}
