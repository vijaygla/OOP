public class TryCatch {
    public static void main(String[] args) {
        String s = "Vijay Kumar Gupta";
        String num = "3225151";
        try {
            int b = Integer.parseInt(num);
            System.out.println(b);
            int a = Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

