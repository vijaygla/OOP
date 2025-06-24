public class ClassObject {

    public static void main(String[] args) {
        Students student1 = new Students();
        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 1 Age: " + student1.age);

        Students student2;
        student2 = new Students();
        student2.printName("John");
    }
}

class Students {

    String name = "vijay";
    int age = 20;

    public void printName(String name) {
        System.out.println("My name is " + name);
    }
}

