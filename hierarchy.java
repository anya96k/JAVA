abstract class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

   public abstract double calculateBonus();

    public abstract void generatePerformanceReport();

    public abstract void manageProject();
}

class Manager extends Employee {

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Manager: " + getName());
    }

    public void manageProject() {
        System.out.println("Managing project for Manager: " + getName());
    }
}

class Developer extends Employee {

    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus() {
        return getSalary() * 0.07;
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Developer: " + getName());
    }

    @Override
    public void manageProject() {
        System.out.println("Developing code for project: " + getName());
    }
}

class Programmer extends Developer {

    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus() {
        return getSalary() * 0.05;
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Programmer: " + getName());
    }

    public void manageProject() {
        System.out.println("Writing code for project: " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", "123 Manager St.", 90000, "Project Manager");
        Developer developer = new Developer("Bob Smith", "456 Developer Ave.", 80000, "Senior Developer");
        Programmer programmer = new Programmer("Charlie Brown", "789 Programmer Rd.", 70000, "Junior Programmer");

        System.out.println(manager.getName() + "'s Bonus: " + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProject();

        System.out.println(developer.getName() + "'s Bonus: " + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.manageProject();

        System.out.println(programmer.getName() + "'s Bonus: " + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.manageProject();
    }
}