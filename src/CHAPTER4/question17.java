package CHAPTER4;
import java.util.Scanner;

public class question17 {

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

//            System.out.println("One mile covers 40 gallon");

            int totalMiles = 0;
            int totalGallons = 0;
            int tripCount = 0;

            while (true) {
                System.out.println("Enter miles ( -1 to exit): ");
                int milesDriven = scanner.nextInt();

                if (milesDriven == -1) {
                    break;
                }

                System.out.println("Enter the gallon used: ");
                int gallonUsed = scanner.nextInt();

                double total = (double) milesDriven / gallonUsed;
                System.out.printf("Miles per gallon for this trip: %.2f%n", total);

                totalMiles += milesDriven;
                totalGallons += gallonUsed;
                tripCount++;

                double overall = (double) totalMiles / totalGallons;
                System.out.printf("Overall average of mile per gallon used currently: %.2f%n", overall);
            }





        }


    }



