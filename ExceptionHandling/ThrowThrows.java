public class ThrowThrows {
    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        } else {
            int c = a / b;
            System.out.println("Output: " + c);
        }
    }

    public static void main(String[] args) {
        ThrowThrows t = new ThrowThrows();
        try {
            t.div(15, 2);
            t.div(15, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


