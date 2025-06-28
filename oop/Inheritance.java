public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Elephant";
        d.weight = 5000.0f;

        d.name();
        d.weight();
    }
}


class Animals {
    String name;
    float weight;

    public void name() {
        System.out.println("Animal Name: " + name);
    }
    public void weight() {
        System.out.println("Animal Weight: " + weight);
    }
}

class Dog extends Animals {

    public void bark() {
        System.out.println("Dog is barking");
    }

    // Run time polymorphism ---> Overriding
    @Override
    public void name() {
        System.out.println("Dog Name: " + name);
    }

    // Compile time polymorphism ---> Overloading
    public void name(String name, int age) {
        System.out.println("Dog Name: " + name + ", Age: " + age);
    }
}


