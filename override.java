package com.sunbeam;
class Employee 
{
	private String name; 
	private int empid; 
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	} 
	//this = emp1 
	//obj = emp2 
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;// downcasting 
		if(this.empid == other.empid)
			return true; 
		return false; 
		
	}
	
	
	
}
public class Program {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Aditya",1,1000.00f); 
		Employee emp2 = new Employee("Aditya",1,1000.00f); 
		if(emp1.equals(emp2))
			System.out.println("Same");
		else 
			System.out.println("not same");
	}
	public static void main1(String[] args) {
		Employee emp1 = new Employee("Aditya",1,1000.00f); 
		Employee emp2 = new Employee("Aditya",1,1000.00f); 
		if(emp1 == emp2)
			System.out.println("Same");
		else 
			System.out.println("not same");

	}

}
