public class ArithmeticExcep {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; 
        int c;
        try {
            c = a/b;
            System.out.println("Output: "+ c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Arthmetic exception found");
        }
    }
}

// exception is runtime error 

