package Learn.Tests.test12;


// define interface
interface Animal {
    //abstract methods
    void eat();
    void sleep();
}

interface Pet{
    void play();
}

class Dog implements Animal, Pet{
    @Override
    public void eat()
    {
        System.out.println("Dog eats bones");
    }

    @Override
    public  void sleep()
    {
        System.out.println("Dog sleeps in kennel");
    }

    @Override
    public void play()
    {
        System.out.println("DOg plays fetch");
    }
}

public class Main {
    public static void main(String[] args){
        Dog dg1 = new Dog();

        dg1.eat();
        dg1.sleep();
        dg1.play();

        // plymorhsim
        Animal animal = dg1;
        animal.eat();
    }
}
