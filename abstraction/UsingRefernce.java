public class UsingRefernce {
    public static void main(String[] args) {
        // since we cant make object of abstract class
        // making the reference of abstract class using sub class
        Programmer p = new A();
        p.Developer();
        p.Tester();
    }
}


abstract class Programmer {
    public abstract void Developer();
    public abstract void Tester();
}

class A extends Programmer {
    @Override
    public void Developer() {
        System.out.println("Developer in class A");
    }

    @Override
    public void Tester() {
        System.out.println("Tester in class A");
    }
}

