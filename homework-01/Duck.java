// Duck class extends Animal and implements Flyable and Swimmable 
public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    // Implemeting the sound method from Animal
    @Override
    public void sound() {
        System.out.println(name + " says: Quack!");
    }

    // Implementing the fly method from Flyable
    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    // Implementing the swim method from Swimmable
    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

