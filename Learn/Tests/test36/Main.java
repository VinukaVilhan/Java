// method overriding

class Animal{
    void speak()
    {
        System.out.println("Animal is speaking");
    }

    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    void speak()
    {
        System.out.println("Dog is barking");
    }

    void activity(){
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal{
    @Override
    void speak()
    {
        System.out.println("Cat is meowing");
    }
}


public class Main {
    public static void main(String args[])
    {
        Animal a = new Dog();
        Dog b = new Dog();

        b.speak();
        a.speak();

        a.eat();
        b.eat();

        b.activity();
    }    
}
