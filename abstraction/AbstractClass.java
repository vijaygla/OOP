public class AbstractClass {
    public static void main(String[] args) {
        // cannot create object of abstract class
        // Animals a = new Animals();

        Dog d = new Dog();
        d.name("Dog");
        d.weight(28);
        d.sound();  

        System.out.println("-------------------");
        Lion l = new Lion();
        l.name("Lion");
        l.weight(190);
        l.sound();
    }    
}


abstract class Animals {
    void name(String name) {
        System.out.println("Animal Name: " + name);
    }

    abstract void sound(); // abstract method, no body
    // abstract method must be implemented in the subclass
}

class Dog extends Animals {
    void weight(int weight) {
        System.out.println("Dog Weight: " + weight + " kg");
    }

    @Override
    void sound() {
        // TODO Auto-generated method stub
        System.out.println("Dog is barking");
    }
}

class Lion extends Animals {
    void weight(int weight) {
        System.out.println("Lion Weight: " + weight + " kg");
    }

    @Override
    void sound() {
        // TODO Auto-generated method stub
        System.out.println("Lion is roaring");
    }
}

