public class ParametrizedConstructor {
    public static void main(String[] args) {
        A obj1 = new A(25, "Alice");
        obj1.display();

        A obj2 = new A(30);
        obj2.display();
    }
}

class A {
    int age;
    String name;
    
    A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    A(int age) {
        this.age = age;
        // here name is not initialized, it will be null by default
    }

    public void display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

