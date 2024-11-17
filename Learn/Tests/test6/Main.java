package Learn.Tests.test6;

// base class
class Employee
{
    protected String name;
    private int id;

    // default constructor
    Employee() {}
    
    // Parameterized constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // display info
    public void displayInfo()
    {
        System.out.println("The name of the employee is: " + name);
        System.out.println("The id of the employee is: "+ id);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

}

class Manager extends Employee
{
    private String department;

    // parameterized constructor
    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    protected void manage()
    {
        System.out.println("Managing the department");
    }

    // override
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("The department is: " + department);
    }
    
}

public class Main {
    public static void main(String[] args)
    {
        // default constructor
        Employee emp1 = new Employee();

        emp1.displayInfo();

        Employee emp2 = new Employee("Vinuka", 1000);

        emp2.displayInfo();

        // modify the id
        emp2.setId(1001);

        // updated info
        emp2.displayInfo();

        Manager manager1 = new Manager("Sithuka", 1003, "IT");

        manager1.manage();

        manager1.displayInfo();

    }
}
