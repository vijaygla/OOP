public class GetterSetter {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Initial Salary: " + a.getSalary(123));
        a.setSalary(150000);
        System.out.println("Updated Salary: " + a.getSalary(123));
    }
}


class A {
    private int salary = 100000;
    private int pass = 123;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(int pass) {
        if (pass == 123) {
            return this.salary;
        }
        return 0;   
    }
}

