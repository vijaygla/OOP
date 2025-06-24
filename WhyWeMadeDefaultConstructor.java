public class WhyWeMadeDefaultConstructor {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}


class A {
    int age;
    String name;
    boolean married;

    // DONE BY JAVA COMPILAR automatically if we not made the self constructor which intialise the default values of all the instance variables which is use less so we made our own default constructor
    // public A() {
    //     this.age = 0;
    //     this.name = null;
    //     this.married = false;
    // }


    // DONE BY DEVELOPER
    public A() {
        age = 18;
        name = "Vijay Kumar";
        married = false;
    }

    public void display() {
        System.out.println("Age: " + age + ", Name: " + name + ", Married: " + married);
    }
}

