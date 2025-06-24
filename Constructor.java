public class Constructor {
    public static void main(String[] args) {
        // Using the no-argument constructor
        A obj1 = new A();
        obj1.x = 10;
        obj1.y = 20;
        obj1.display();

        // Using the parameterized constructor
        A obj2 = new A(30, 40);
        obj2.display();

    }
}


class  A {
    int x;
    int y;

    // Constructor without parameters (no-argument constructor)
    public A() {

    }


    // Constructor with parameters
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display values
    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

