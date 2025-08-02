// Abstract class  ka kabhi bhi object nahi banta hai 
// We don't make an object of an abstract class because it is incomplete—it may have abstract methods without implementation, so it cannot be instantiated directly.
// abstraction class ke adar jotne  abstract method hai sabko override karna padega nahi to error dega
// abstraction class ke ander non abstract and abstract method dono bana sakte hai


public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.play();
        d.sleep();
        d.eat();
    }
}


abstract class Animals {
    // abstract method
    abstract void play();
    abstract void sleep();

    // non abstract method
    void eat() {
        System.out.println("Animals is eating");
    }
}

class Dog extends Animals {

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
