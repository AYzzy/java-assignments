package CHAPTER4;

public class question27 {

        public static void main(String[] args) {
            int rows = 5;
            int cols = 5;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {

                    System.out.print((i + j) % 2 == 0 ? "X" : "O");
                }

            }
        }



}
