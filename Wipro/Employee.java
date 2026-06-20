import java.util.*;

abstract class EmployeeDetails {
    String name;
    int id;

    EmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends EmployeeDetails {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends EmployeeDetails {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

class Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Full Time Employee");
        System.out.println("2. Part Time Employee");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        EmployeeDetails emp;

        if (choice == 1) {
            System.out.print("Enter Monthly Salary: ");
            double salary = sc.nextDouble();
            emp = new FullTimeEmployee(name, id, salary);
        } else {
            System.out.print("Enter Hours Worked: ");
            int hours = sc.nextInt();

            System.out.print("Enter Rate Per Hour: ");
            double rate = sc.nextDouble();

            emp = new PartTimeEmployee(name, id, hours, rate);
        }

        System.out.println("\nEmployee Details");
        emp.display();
    }
}