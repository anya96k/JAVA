public class array {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = value++;
            }
        }

        System.out.println("Output 1:");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Output 2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Output 3:");
        // Diagonal (i == j) and Anti-diagonal (i + j == 4)
        for (int i = 0; i < 5; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            if (i != 4) { 
                System.out.print(matrix[i][4 - i] + " ");
            }
        }
    }
}