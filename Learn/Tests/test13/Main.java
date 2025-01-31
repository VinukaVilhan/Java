class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
    void fetch() {
        System.out.println("Fetching...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        Dog myDog = (Dog) myAnimal; // Downcasting
        myDog.makeSound(); // Outputs: Bark
        myDog.fetch(); // Outputs: Fetching...
    }
}