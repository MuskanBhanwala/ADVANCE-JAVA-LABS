package TEST;

class Animal {
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Overriding the makeSound() method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    // Overriding the makeSound() method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Override1 {
    public static void main (String[] args)
    {
        // Create objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Call makeSound() method on each object
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
