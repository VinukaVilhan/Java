class Car{
    String color;
    String type;

    // default constructor
    public Car(){
        this("red", "sedan");
    }

    // parameterized constructor
    public Car(String color, String type)
    {
        this.color = color;
        this.type = type;
    }

    public void display()
    {
        System.out.println("Color: "+ color +" Type: "+ type);
    }
}

public class Main {
    public static void main(String args[])
    {
        Car car = new Car();
        car.display();

        Car car2 = new Car("blue", "SUV");
        car2.display();
    }    
}
