public class NullPointerExcep {
    public static void main(String[] args) {
        String s = null;
        String str = "vijay kumar gupta";
        try {
            System.out.println(str.toUpperCase());
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("null can't conveted to uppper case");
        }
    }
}

