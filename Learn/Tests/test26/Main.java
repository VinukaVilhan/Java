class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }

    void eat()
    {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String args[]){

        // upcasting

        Animal myAnimal2 = new Animal();
        myAnimal2.sound();

        Animal myAnimal1 = new Dog();
        myAnimal1.sound();
        myAnimal1.eat();
        
        Dog myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }    
}
