import java.util.Scanner;

public class Triangle {
    private double side1, side2, side3;

    public Triangle() {
        side1 = side2 = side3 = 0.0;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        this.side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        this.side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        this.side3 = sc.nextDouble();
    }

    public void display() {
        System.out.println("Side 1: " + side1 + ", Side 2: " + side2 + ", Side 3: " + side3);
    }

    public double calcPeri() {
        return side1 + side2 + side3;
    }

    public boolean isValid() {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }



    public static void main(String[] args) {
        Triangle[] arr = new Triangle[4]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Triangle();  
            arr[i].accept();  

            if (arr[i].isValid()) {
                arr[i].display();
                System.out.println("Perimeter: " + arr[i].calcPeri());
            } else {
                System.out.println("Triangle " + (i + 1) + " is not valid.");
            }
            System.out.println();  
        }
    }
}