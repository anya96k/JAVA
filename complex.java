public class Complex {
    private double real;
    private double img;

    public Complex() {
    }

    public void init(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void display() {
        System.out.println("Complex Number: " + real + " + " + img + "i");
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(" two command-line arguments for real and imaginary parts.");
            return;
        }

        try {
            double real = Double.parseDouble(args[0]);
            double img = Double.parseDouble(args[1]);

            Complex complexNumber = new Complex();
            complexNumber.init(real, img);

            complexNumber.display();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. enter valid numbers for real and imaginary parts.");
        }
    }
}