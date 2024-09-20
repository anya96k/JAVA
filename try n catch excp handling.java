import java.util.Scanner;

class exception {
    public static void main(String args[]) {
        System.out.println("The Program is:");

        int a = 10, b = 0, c;
        try {
            if (b != 0) {
                c = a / b;
                System.out.println(c);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: ");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int divisor = 4;

        System.out.println("Result of division by " + divisor + ":");
        for (int num : array) {

            try {
                int result = num / divisor;
                System.out.println(num + " / " + divisor + " = " + result);
            } 
            catch (Exception e) {
                System.out.println("Error: Division by zero for number " + num);
            }
        }
        scanner.close();
    }
}
