import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // clients c = new vijay();
        vijay v = new vijay();
        v.input();
        v.output();
    }
}


interface clients {
    void input();
    void output();
}

class vijay implements clients {
    String name;
    int salary;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        System.out.print("Enter your salary: ");
        salary = sc.nextInt();
        sc.close();
    }

    public void output() {
        System.out.println("Welecome to the interface");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

