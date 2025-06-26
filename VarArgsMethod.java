public class VarArgsMethod {

    public static void main(String[] args) {
        A a = new A();
        a.sum();
        a.sum(2, 9);
        a.sum(11, 2, 3);
    }
}


class A {
    void sum(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}


