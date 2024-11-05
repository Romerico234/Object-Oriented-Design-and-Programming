// Abstract class represneting general chractersitics of an animal
public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method for the sound an animal makes
    public abstract void sound();

    // Concrete method for sleeping
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

