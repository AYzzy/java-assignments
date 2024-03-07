package CHAPTER4;

public class question22 {

        public static void main(String[] args) {
            System.out.println("\nN\tN^2\tN^3\tN^4");
            for (int n = 1; n <= 5; n++) {
                int Square = n * n;
                int Cube = n * n * n;
                int four = n * n * n * n;
                System.out.printf("%d\t%d\t%d\t%d%n", n, Square, Cube, four);
            }
        }


}
