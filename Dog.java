class Dog {

    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Dog actions
    public void bark() {
        System.out.println(name + " barks loudly!");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Main class (NOT public)
class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", "German Shepherd");
        Dog dog2 = new Dog("Luna", "Labrador");

        dog1.bark();
        dog1.eat();

        dog2.bark();
        dog2.eat();
    }
}
