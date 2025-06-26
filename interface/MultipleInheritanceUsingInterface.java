public class MultipleInheritanceUsingInterface implements A, B {

    @Override
    public void display() {
        System.out.println("Multiple Inheritance using Interface is implemented.");
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface m = new MultipleInheritanceUsingInterface();
        m.display();
    }    
}

interface A {
    void display();
}

interface B {
    void display();
}

