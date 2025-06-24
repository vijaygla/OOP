public class CopyConstructor {
    public static void main(String[] args) {
        A obj = new A(25, "Alice");
        A copyObj = new A(obj); // Using the copy constructor
        System.out.println("Original Object: Age = " + obj.age + ", Name = " + obj.name);
        System.out.println("Copied Object: Age = " + copyObj.age + ", Name = " + copyObj.name);
    }
}


class A {
    int age;
    String name;

    A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    A(A ref) {
        this.age = ref.age;
        this.name = ref.name;
    }
}

