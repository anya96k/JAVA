import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        System.out.println("Enter 1st Double value:");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Not Double type input");
            return;
        }

        double b = 0;
        System.out.println("Enter 2nd Double value:");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println("Not Double type input");
            return;
        }

        System.out.println("a: " + a + " b: " + b);
        double sum = a + b;
        double avg = sum / 2;

        System.out.println("Avg of two double values: " + avg);
    }
}

