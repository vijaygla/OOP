// all the method are abstract and public in interface by default
// interface ka kabhi bhi object nahi banta hai 
// We don't make an object of an interface because it only contains method declarations (no implementation), so there's nothing to execute or instantiate directly.

public class interfaces {
    public static void main(String[] args) {
        Human h = new Human();
        h.play();
        h.eat();
        h.code();
        h.work();
        h.sum(10, 5);
    }
}

interface Animals {
    void play();

    void eat();
}

interface Robot {
    void code();

    void work();
}

@FunctionalInterface
interface Calculate {
    void sum(int a, int b);
}

class Human implements Animals, Robot, Calculate {

    @Override
    public void play() {
        System.out.println("animals is playing");
    }

    @Override
    public void eat() {
        System.out.println("animals is eating");
    }

    @Override
    public void code() {
        System.out.println("Robort is coding");
    }

    @Override
    public void work() {
        System.out.println("Robort is working");
    }

    @Override
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

// Funtional Interface---> jiske pass 1 hi method ho
// Lamda Expression is always implemented using the functional interface


