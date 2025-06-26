public class MultiLevel {
    public static void main(String[] args) {
        D ref = new D();
        ref.add();
        ref.sub();
        ref.mul();
        ref.div();
    }
}

class A { // super class
    int a, b;

    void add() {
        a = 20;
        b = 10;
        System.err.println("Sum: " + (a + b));
    }
}

class B extends A { // sub1 class
    void sub() {
        a = 20;
        b = 10;
        System.out.println("Difference: " + (a - b));
    }
}

class C extends B { // sub2 class
    void mul() {
        a = 20;
        b = 10;
        System.out.println("Product: " + (a * b));
    }
}

class D extends C { // sub3 class
    void div() {
        a = 20;
        b = 10;
        System.out.println("Divide: " + (a / b));
    }
}

