public class interfaceExtend {
    public static void main(String[] args) {
        C c = new C();
        c.add(5, 3);
        c.sub(5, 14);
    }
}

interface A {
    void add(int a, int b);
}

interface B extends A {
    void sub(int a, int b);
}

class C implements B {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        if (a < b) {
            System.out.println("Subtraction: " + (b - a));
        }
        else {
            System.out.println("Subtraction: " + (a - b));
        }
    }
}

