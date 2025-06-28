public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
            int a = 20, b = 3, c;
            c = a / b;
            System.out.println("output: "+c);
        } catch (Exception e) {
            System.out.println("cant divide by zero");
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("this is last statement");
    }
}

// finally block must will be run
