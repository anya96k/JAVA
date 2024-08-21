class savingsAccount
{
static float annualInterestRate=0.04f;
private float savingsBalance;

void calculateMonthlyInterest(float savingsBalance)
{
float MonthlyInterest;
MonthlyInterest=(annualInterestRate*savingsBalance)/12;
savingsBalance+=MonthlyInterest;
System.out.println("Balance is:="+savingsBalance);
}

static void modifyInterestRate(float newRate)
{
annualInterestRate=newRate;
}

public static void main(String[] args)
{
savingsAccount s1=new savingsAccount();
s1.calculateMonthlyInterest(2000.0f);
s1.modifyInterestRate(0.05f);
s1.calculateMonthlyInterest(2000.0f);


savingsAccount s2=new savingsAccount();
s2.calculateMonthlyInterest(3000.0f);
s2.modifyInterestRate(0.05f);
s2.calculateMonthlyInterest(3000.0f);

}
}
