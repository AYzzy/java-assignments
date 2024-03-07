package CHAPTER4;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int creditLimit=1000;
        int newBalance;

        System.out.println("Welcome to the Credit Limit Calculator");

        while (true) {
            System.out.print("Enter customer account number (or -1 to quit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total of items charged this month: ");
            int Charged = input.nextInt();

            System.out.print("Enter total credits applied this month: ");
            int credits = input.nextInt();

//            System.out.print("Enter allowed credit limit: ");
//            creditLimit = input.nextInt();

            newBalance = beginningBalance + Charged - credits;

            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }

    }
}
