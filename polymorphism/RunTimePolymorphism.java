// Run time polymorphism

public class RunTimePolymorphism {
    public static void main(String[] args) {
        B b = new B();
        b.sum(5, 10);

        A a = new A();
        a.sum(20, 10);
    }
}


class A {
    void sum (int a, int b) {
        System.out.println("Sum of two integers in class A: " + (a + b));
    }
}

class B extends A {

    // Method overriding---> cannot  be perform without inheritance.
    @Override
    void sum(int a, int b) {
        System.out.println("Sum of two integers in class B: " + (a + b));
    }
}

