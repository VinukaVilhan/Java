class Animal {
    Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() {
        return new Dog();
    }
}

class Cat{
    Cat getAnimal() {
        return new Cat();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Cat myCat = new Cat();
        Animal returnedAnimal = myAnimal.getAnimal();  // Calls Dog's overridden method
        System.out.println("Returned object type: " + returnedAnimal.getClass().getSimpleName());

        System.out.println(myAnimal instanceof Dog);  
        System.out.println(myAnimal instanceof Animal);
        System.out.println(myCat instanceof Cat);
    }
}
