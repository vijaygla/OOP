// abstract ---> means incomplete adhura

public class AbstractMethod {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}


abstract class A {
    abstract void display();
}

class B extends A {
    @Override
    void display() {
        System.out.println("Display method in class B");
    }
}

