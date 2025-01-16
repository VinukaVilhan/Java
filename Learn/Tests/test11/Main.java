package Learn.Tests.test11;

class Animal {
    String type;
    
    Animal(String type) {
    this.type = type;
    System.out.println("Animal constructor called for: " + type);
}
}

class Dog extends Animal {
    Dog() {
        super("Dog"); // Calls the constructor of Animal with "Dog" as the argument
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Dog dg1 = new Dog();
        System.out.println(dg1.type);
    }
}
