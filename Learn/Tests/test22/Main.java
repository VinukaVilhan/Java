class Animal{
    String type;

    Animal (String type)
    {
        this.type = type;
        System.out.println("Animal constructor called for " + type);    
    }

    void sound()
    {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    Dog(){
        // calls the constructor with dog as the argument
        super("Dog");
        System.out.println("Dog constructor called");
    }
}

class Cat extends Animal{
    Cat(){
        // calls the constructor with cat as the argument
        super("Cat");
        System.out.println("Cat constructor called");
    }

    @Override
    void sound()
    {
        super.sound();
        System.out.println("Meow");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("type: " + dog.type);

        Cat cat = new Cat();
        System.out.println("type: " + cat.type);
        cat.sound();
    }
}
