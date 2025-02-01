class Animal {
    int legs = 10;
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{

    int legs = 4;
    @Override 
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    int legs = 4;
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        System.out.println("Legs: "+ a.legs);

        Animal b = new Cat();
        b.sound();

        Animal c= new Animal();
        c.sound();

        Dog d = new Dog();
        d.sound();
        System.out.println("Legs: "+ d.legs);

    }    
}
