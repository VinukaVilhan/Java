package Learn.Tests.test9;

class Car{
    String color;
    String type;

    // default constructor
    public Car(){
        this("Red", "Suzuki");
    }

    // parameterized constructor
    public Car(String color, String type)
    {
        this.color = color;
        this.type = type;
    }

    public void printDetails(){
        System.out.println("Color: " + color + ", Type: " + type);
    }
}

// constructor chaining
public class Main {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.printDetails();

        Car customerCar = new Car("Blue", "Benz");
        customerCar.printDetails();
    }
}
