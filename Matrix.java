import java.util.Scanner;

class Matrix 
{
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);

    void getArrayElements() {
        System.out.println("x:\nEnter the elements of the 1st matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("x:\nEnter the elements of the 2nd matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void addMatrix() {
        System.out.println("\nAddition of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int c = a[i][j] + b[i][j];
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void subMatrix() {
        System.out.println("\nSubtraction of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int c = a[i][j] - b[i][j];
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void mulMatrix() {
        System.out.println("\nMultiplication of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              int c=0;
              for(int k=0;k<2;k++)
              {
                c+=a[i][k]*b[i][j];
              }
                
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.getArrayElements();
        System.out.println("\nFirst matrix:");
        m.printMatrix(m.a);
        System.out.println("\nSecond matrix:");
        m.printMatrix(m.b);
        m.addMatrix();
        m.subMatrix();
        m.mulMatrix();
    }
}