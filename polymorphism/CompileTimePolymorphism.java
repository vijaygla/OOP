// compile time polymorphism

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        A a = new A();
        a.sum(5, 10);
        a.sum(5.5, 10.5);
        a.sum(1, 2, 3);
        a.sum(1, 2, 3.5f, 4.5);
    }    
}


class A {
    void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    
    // method overloading
    void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    // method overloading
    void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // method overloading
    void sum(int a, long b, float c, double d) {
        System.out.println("Sum of int, long, float, and double: " + (a + b + c + d));
    }
}

