abstract class Vehicle{
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    // abstract method
    public abstract void start();

    // concrete method
    public void stop(){
        System.out.println(name + " is stopping");
    }

    public void showSpeed(){
        System.out.println(name + " is running at " + speed + " km/h");
    }
}

class Car extends Vehicle{
    public Car (String name, int speed){
        super(name, speed);
    }

    @Override
    public void start(){
        System.out.println(name + " is starting");
    }
}

class Bike extends Vehicle{
    public Bike(String name, int speed){
        super(name, speed);
    }

    @Override
    public void start(){
        System.out.println(name + " is starting");
    }
}

public class Main {
    public static void main(String[] args){

        Car myCar = new Car("BMW", 100);
        myCar.start();
        myCar.showSpeed();
        myCar.stop();

        Bike myBike = new Bike("Yamaha", 50);
        myBike.start();
        myBike.showSpeed();
        myBike.stop();
    }    
}
