public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}


class A {
    int a = 10;

    void display() {
        System.out.println("Value of a in class A using method: " + a);
    }
}

class B extends A {
    int a = 20;

    @Override
    void display() {
        super.display();
        System.out.println("Value of a in class B: " + a);
        System.out.println("Value of a in class A: " + super.a);
    }
}

