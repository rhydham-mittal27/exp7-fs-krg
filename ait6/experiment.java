package fs.tut.ait6;

import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;

    Employee() {

    }

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void getFinalSalary() {

    }

}

class ContractEmployee extends Employee {
    ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    void getFinalSalary() {
        double mysalary = super.basicSalary * 1.1;
        System.out.println("Final Salary: " + mysalary);
    }
}

class PermanentEmployee extends Employee {
    PermanentEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    void getFinalSalary() {
        double mysalary = super.basicSalary * 1.2;
        System.out.println("Final Salary: " + mysalary);
    }
}

public class experiment {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases: ");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String employee_type;
            String employee_name;
            double salary;
//            System.out.println("Enter the number of testcases: ")
            employee_type = sc.next();
            employee_name = sc.next();
            salary = sc.nextDouble();
            if (employee_type.equals("P")) {
                PermanentEmployee emp = new PermanentEmployee(employee_name, salary);
                System.out.println("Employee: " + emp.name);
                emp.getFinalSalary();

            } else {
                ContractEmployee emp = new ContractEmployee(employee_name, salary);
                System.out.println("Employee: " + emp.name);
                emp.getFinalSalary();
            }
        }
    }
}
