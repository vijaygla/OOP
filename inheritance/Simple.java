// sub class
public class Simple extends Student {

    void display() {
        name = "Vijay Kumar"; 
        age = 20;
        marks = 80;
        System.out.println("Name: "+ name + " " + "Age: "+age + " " + "Marks: "+marks);
    }

    public static void main(String[] args) {
        Simple ref = new Simple();
        ref.printer();
        ref.display();
    }
}


// super class
class Student {
    String name; int age, marks; 

    void printer() {
        System.out.println("this is parent or super class:");
    }
}

