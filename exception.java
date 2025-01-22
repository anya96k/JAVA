import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class StringLengthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        try {
            if (inputString.length() > 80) {
                throw new ExceptionLineTooLong("The string is too long");
            }
            
            System.out.println("The length of the string is: " + inputString.length());
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
