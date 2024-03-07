package CHAPTER4;

public class QUESTION33 {
            public static void main(String[] args) {
                int rows=1;
                for (int i = 0; i < rows; i++) {
                    int cols=1;
                    for (int j = 0; j < cols; j++) {

                        System.out.print((i + j) % 2 == 0 ? "*" : " ");

                    }
                    System.out.println();
                }
            }
}
