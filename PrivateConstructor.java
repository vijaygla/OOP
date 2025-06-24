public class PrivateConstructor {
    public static void main(String[] args) {
        A.display();
    }
}


class  A {
    int a, b, c;
    private A() {
        a = 10;
        b = 20;
        c = 30;
    }

    public static void display() {
        A obj = new A(); // Creating an instance of A using the private constructor
        System.out.println("a: " + obj.a + ", b: " + obj.b + ", c: " + obj.c);
    }
}

