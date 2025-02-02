class Animal{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String args[])
    {
        // upcast
        Animal myAnimal = new Dog();
        myAnimal.sound();

        // downcast
        if(myAnimal instanceof Dog)
        {
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        }else{
            System.out.println("Cannot downcast");
        }

    }    
}
