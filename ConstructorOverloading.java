public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating objects of class A using different constructors
        A obj1 = new A();
        A obj2 = new A("Alice");
        A obj3 = new A("Bob", 30);
    }
}


class A {
    A() {
        System.out.println("Default constructor called");
    }

    A(String name) {
        System.out.println("Constructor with one parameter called: " + name);
    }

    A(String name, int age) {
        System.out.println("Constructor with two parameters called: " + name + ", " + age);
    }
}

