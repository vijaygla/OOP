package inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        B ref1 = new B();
        ref1.input();
        ref1.display1();

        C ref2 = new C();
        ref2.input();
        ref2.display2();
    }
}

class A { // super class
    void input() {
        System.out.println("Enter you name: ");
    }
}

class B extends A { // sub1 class
    void display1() {
        System.out.println("My name is Vijay");
    }
}

class C extends A { // sub2 class
    void display2() {
        System.out.println("My name is Kumar");
    }
}

