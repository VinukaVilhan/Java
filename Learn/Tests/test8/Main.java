package Learn.Tests.test8;

// abstract class vehicle
abstract class Vehicle{
    private String model;
    private final double rentalPricePerDay;
    private boolean isAvailable;

    // constructor
    public Vehicle(String model, double rentalPricePerDay)
    {
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }


    // abstract method
    public abstract double calcRental(int days);

    // concrete methods
    public String getModel(){
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public double getRentalPricePerDay()
    {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}

class Car extends Vehicle{
    private final String fuelType;

    // constructor
    public Car(String model, double rentalPricePerDay, String fuelType)
    {
        super(model, rentalPricePerDay);
        this.fuelType = fuelType;
    }

    @Override
    public double calcRental(int days){
        double baseCost = getRentalPricePerDay() * days;

        if(days > 5){
            return baseCost * 0.9;
        }
        return baseCost;
    }

    // Getter for fuel type
    public String getFuelType() {
        return fuelType;
    }
}


class MotorCycle extends Vehicle{
    private final int enigneCapacity;

    public MotorCycle(String model, double rentalPricePerDay, int enigneCapacity)
    {
        super(model, rentalPricePerDay);
        this.enigneCapacity = enigneCapacity;

    }

    @Override
    public double calcRental(int days){
        double baseCost = getRentalPricePerDay() * days;

        if(enigneCapacity > 500)
        {
            return baseCost * 1.15;
        }

        return baseCost;
    }

    public int getEngineCapacity()
    {
        return enigneCapacity;
    }
}

class RentalAgency{
    public static int totalVehicles = 0;

    // array of vehicles
    private final Vehicle[] vehicles;
    private int vehicleCount;


    public RentalAgency(int maxVehicles)
    {
        vehicles = new Vehicle[maxVehicles];
        vehicleCount = 0;
    }


    // add a new vehicle

    public void addVehicle(Vehicle vehicle)
    {
        if(vehicleCount < vehicles.length)
        {
            vehicles[vehicleCount] = vehicle;
            vehicleCount++;
            totalVehicles++;
        }
    }
    // check vehicle availabiliy

    public boolean checkAvail(String model){
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle != null && vehicle.getModel().equals(model) && vehicle.isAvailable())
            {
                return true;
            }
        }
        return false;
    }

    public static int getTotalVehicles()
    {
        return totalVehicles;
    }

    // calc total cost for a specific vehicle
    public double calcRental(String model, int days)
    {
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle != null && vehicle.getModel().equals(model)){
                return vehicle.calcRental(days);
            }
        }
    
     return -1;   
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Vehical Rental mgmt System");

        // new rental agency
        RentalAgency ra1 = new RentalAgency(5);

        // add vehicles

        // upcasting: treating a child class obj as its parent class
        Vehicle  car1 = new Car("Hilux Cab", 20.0 ,"Petrol");
        Vehicle  mc1 = new MotorCycle("Duke", 100.0, 990);

        // downcasting: converting a parent class reference back to its child class
        if (car1 instanceof Car){
            Car spc = (Car) car1;
            System.out.println("Fuel Type: " + spc.getFuelType()); 

        }

        ra1.addVehicle(car1);
        ra1.addVehicle(mc1);

        System.out.println("Car rantal cost for 4 days: " + ra1.calcRental("Hilux Cab", 4));
        System.err.println("Motorcycle rental cost for 5 days: "+ ra1.calcRental("Duke", 2));

        // ststic mehtod should be accessed in a static way
        System.out.println("Total vechicles: "+ RentalAgency.getTotalVehicles());


    }
}
