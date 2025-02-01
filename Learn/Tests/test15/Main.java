interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();  
    }
}
