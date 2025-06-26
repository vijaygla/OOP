public class ThisKeyword {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a.display();

        B b = new B("class B");

        C c = new C();
    }    
}


class A {
    void display() {
        System.out.println(this);
    }
}

class B {
    B() {
        System.out.println("Default Constructor of class B created by developer");
    }

    B(String name) {
        this();
        System.out.println("Hello "+ name);
    }
}

class C {
    C() {
        this("class C");
        System.out.println("Default Constructor of class C created by developer");
    }

    C(String name) {
        System.out.println("Hello " + name);
    }
}

