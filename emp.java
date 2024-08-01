import java.util.Scanner;

class Emp{

	String fname,lname;
	float salary;
	

	Emp()
	{
		this.fname = "" ;
		this.lname = "" ;
		this.salary = 0.0f;
	}

	void setData()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter First name:");
		fname=myObj.nextLine();

		System.out.print("Enter last name:");
		lname =  myObj.nextLine();

		System.out.print("Enter Salary:");
		salary = myObj.nextFloat();

		//System.out.println("Name is:"+fname+" "+lname+"\n"+"Salary is:"+salary);
	}

	void display()
	{
		float X= salary * 0.1f;
		salary=salary+X ;

		System.out.println("Name:"+fname+" "+lname);
		System.out.println("salary of "+fname+" is :"+salary);
		
	}
 public static void main(String [] args)
{
	Emp a = new Emp();
	Emp b = new Emp();
	a.setData();
	b.setData();

	a.display();
	b.display();


}
}