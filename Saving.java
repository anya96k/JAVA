public class Saving 
{
    private double savingBalance;
    private static double interestRate;

    public Saving(double balance)
    {
        this.savingBalance = balance;
    }

    
    public void calculateMonthlyInterest() 
    {
        double monthlyInterest = (savingBalance * interestRate / 12) / 100;
        savingBalance += monthlyInterest;
    }

  
    public void printSavingBalance()
   {
        System.out.printf("Saving Balance: Rs%.2f%n", savingBalance);
    }

  
    public static void modifyInterestRate(double newRate) 
    {
        interestRate = newRate;
    }

  
    public static void main(String[] args)
     {
        Saving saver1 = new Saving(2000.00);
        Saving saver2 = new Saving(3000.00);

        Saving.modifyInterestRate(4.0);
        System.out.println("Balance with 4% Interest:");
        saver1.calculateMonthlyInterest();
        saver1.printSavingBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingBalance();

        Saving.modifyInterestRate(5.0);
        System.out.println("Balance with 5% Interest:");
        saver1.calculateMonthlyInterest();
        saver1.printSavingBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingBalance();
    }
}