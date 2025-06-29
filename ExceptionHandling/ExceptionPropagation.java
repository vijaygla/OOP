public class ExceptionPropagation {

    public static void m1() {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Exception handled by m1 method");
        }
    }
    public static void m2() {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        m1();
    }
}


