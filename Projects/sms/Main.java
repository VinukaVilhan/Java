package Projects.sms;

class Student{
    public String name;
    protected int age;
    private int id;
    public static int num_of_students = 0;
    public static String university_name;

    // default constructor
    Student()
    {
        // if you need initialize default values
        this.name = "Unknown";
        num_of_students++;

    }

    // parameterized constructor
    Student(String name, int age, int id, String university_name)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.university_name = university_name;
        num_of_students++;
    }

    // display student info
    public void displayStudentInfo()
    {
        System.out.println("the student name is: "+ name);
        System.out.println("the student age is: "+ age);
        System.out.println("the student ID is: "+ id);
        System.out.println("the student's university name is: "+ university_name);
    }

    // calculate fee
    public double calculateFees()
    {
        return 1000.0;
    }

    // getters and setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}


class InternationalStudent extends Student
{
    private String origin_country;
    private String visa_status;

    // constructor
    InternationalStudent(String name, int age, int id, String university_name, String origin_country, String visa_status)
    {
        super(name, age, id, university_name);
        this.origin_country = origin_country;
        this.visa_status = visa_status;
    }

    // override fee calculation
    @Override
    public double calculateFees()
    {
        return super.calculateFees() * 2;
    }

    // display infromation
    @Override
    public void displayStudentInfo()
    {
        super.displayStudentInfo();
        System.out.println("The orgin country is: "+ origin_country);
        System.out.println("The visa status is: " + visa_status);
    }

    // getters and setters
    public String get_origin_country()
    {
        return origin_country;
    }

    public void set_origin_country(String origin_country)
    {
        this.origin_country = origin_country;
    }

    public String get_visa_status()
    {
        return visa_status;
    }

    public void set_visa_status(String visa_status)
    {
        this.visa_status = visa_status;
    }

}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the student management system");

        // create a student
        Student student1 = new Student("Vinuka", 20, 1000, "University Of Moratuwa");

        Student student2 = new Student();

        Student student3 = new Student();

        student3.setId(1001);
        System.out.println("The student ID of 3 student is :" + student3.getId());

        // number of students
        System.out.println("The number of students are: "+ Student.num_of_students);

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // display the fees
        System.out.println("Calculated fees: "+ student1.calculateFees());

        // the international student
        InternationalStudent in1 = new InternationalStudent("Sithuka", 12, 1001, "University Of Colombo", "Sri Lanka", "Active");
        InternationalStudent in2 = new InternationalStudent(null, 0, 0, null, null, null);

        in2.set_origin_country("America");
        in2.set_visa_status("Active");

        System.out.println("The origin country: " + in2.get_origin_country());
        System.out.println("The visa status: " + in2.get_visa_status());

        // display info
        in1.displayStudentInfo();
        in2.displayStudentInfo();

        // calculate fee
        System.out.println("The calculated fee is: " + in1.calculateFees());

    }
}
