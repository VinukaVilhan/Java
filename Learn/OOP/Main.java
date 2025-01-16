
// base class
class Vehicle
{
    // proteceted is accessible in subclass
    protected String brand = "Ford";
    public void honk()
    {
        System.out.println("Toooot!!");
    }
}


class Car extends Vehicle
{
    private final String modelName = "Mustang";

    // get method to get model name
    public String getModelName()
    {
        return modelName;
    }

    public void displayBrand()
    {
        System.out.println("The brand is : " + brand);
    }

    // override method
    @Override
    public void honk()
    {
        System.out.println("Mustang horn: Vrutttttttu");
    }
}

public class Main {
    public static void main (String[] args)
    {
        System.out.println("The OOP concept inheritance is shown");

        // creating car object 
        Car mycar = new Car();

        // honk method
        mycar.honk();

        // brand and model name
        mycar.displayBrand();
        System.out.println("Model is : "+ mycar.getModelName());

    }
}
