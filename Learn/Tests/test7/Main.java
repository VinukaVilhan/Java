package Learn.Tests.test7;

import java.util.Scanner;

abstract class Employee
{
    protected String Name;
    private int id;
    protected double salary;

    // default constructor
    // Employee() {
    //     this.Name = "Unknown";
    //     this.id = 0;
    //     this.salary = 0.0;
    // }

    // parameterized constructor
    Employee(String Name, int id, double salary) {
        this.Name = Name;
        this.id = id;
        this.salary = salary;
    }
    
    // abstract method to calculate bonus
    public abstract double calculateBonus();

    public void displayInfo()
    {
        System.out.println("The name of the employee: " + Name);
        System.out.println("The id of the employee: " + id);
        System.out.println("The salary of the employee: " + salary);
    }

    // getter and setter
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
    
    
}


class Manager extends Employee
{
    private String department;

    Manager(String department, String Name, int id, double salary) {
        super(Name, id, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus()
    {
        return salary * 10/100; 
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("The department is: "+ department);
    }

    // getter and setter
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }
    
}

class Developer extends Employee
{
    private final String programmingLanguage;

    // parameterized constructor
    Developer(String programmingLanguage, String Name, int id, double salary) {
        super(Name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus()
    {
        return salary * 8/100;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("The programming language is: " + programmingLanguage);
    }
    
}


public class Main {
    public static void main(String[] args)
    {
        System.err.println("Welcome to the EMS!!");

        // initialize the scanner
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Choose an employee type:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Employee employee;

            switch (choice) {
                case 1:
                    {
                        // manager
                        System.out.println("Enter the Manager's name");
                        String name = scanner.nextLine();
                        System.out.println("Enter the ID");
                        int id = scanner.nextInt();
                        System.out.println("Enter the salary");
                        double salary = scanner.nextDouble();
                        // nextLine()  should be added when you are going to take string as input
                        scanner.nextLine();
                        System.out.println("Enter the department");
                        String department = scanner.nextLine();
                        // initialize the constructor
                        employee = new Manager(department, name, id, salary);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter the developer's name");
                        String name = scanner.nextLine();
                        System.out.println("Enter the developer's ID");
                        int id = scanner.nextInt();
                        System.out.println("Enter the developer's salary");
                        double salary = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter the programming language");
                        String programmingLanguage = scanner.nextLine();
                        // initialize the constructor
                        employee = new Developer(programmingLanguage, name, id, salary);
                        break;
                    }
                default:
                    System.out.println("Invalid choice !");
                    return;
            }

        employee.displayInfo();
        System.out.println("Bonus: $" + employee.calculateBonus());

        }
    } 
}
