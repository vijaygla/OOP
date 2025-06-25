package basic;

public class Main {

    public static void main(String[] args) {
        System.out.println("School Name: " + Students.schoolName);
        Students s = new Students();
        System.out.println("Student Name: " + s.studentName);

        // Animals a = new Animals();
        // a.name = "Lion";
        // a.age = 5;
        // System.out.println("Animal Name: " + a.name);
        // System.out.println("Animal Age: " + a.age);

        // Animals b = new Animals();
        // b.name = "Elephant";
        // b.age = 10;
        // System.out.println("Animal Name: " + b.name);
        // System.out.println("Animal Age: " + b.age);

        Animals a = new Animals("Lion", 5, "Meat", 200);
        System.out.println("Animal Name: " + a.name + ", Age: " + a.age + ", Food: " + a.food + ", Weight: " + a.weight);
    }
}

class Students {
    static String schoolName = "ABC High School";
    String studentName = "John Doe";
}

class Animals {
    String name;
    int age;
    String food;
    int weight;

    // Constructor
    Animals(String name, int age, String food, int weight) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.weight = weight;
    }
}


