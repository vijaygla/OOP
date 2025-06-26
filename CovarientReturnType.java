public class CovarientReturnType {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}


class A {
    public A display() {
        System.out.println("methos is covarint return type in parent class");
        return this;
    }
}


class B extends A {
    @Override
    public B display() {
        System.out.println("method is covarint return type in child class");
        return this;
    }
}

