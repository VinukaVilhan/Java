class Employee {
    static int companyCode = 100;
    String name;

    Employee(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String args[])
    {
        Employee e1 = new Employee("alice");
        Employee e2 = new Employee("Vinuka");

        System.out.println(e1.companyCode);
        System.out.println(Employee.companyCode);
    }
}
