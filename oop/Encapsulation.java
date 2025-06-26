package oop;

public class Encapsulation {

    public static void main(String[] args) {
        Jack j = new Jack();
        System.out.println("Job: " + j.job);
        System.out.println("Salary: " + j.getSalary(123));

        JuniorJack jj = new JuniorJack();
        System.out.println("Job: " + jj.job);
        System.out.println("Salary: " + jj.getSalary(123));
    }
}

class Jack {
    String job = "Software Engineer";
    private int salary = 100000;
    private int pass = 123;

    public int getSalary(int pass) {
        if (this.pass == pass) {
            return this.salary;
        }
        return 0;
    }
}

class JuniorJack extends Jack {

}

