// static block always run before the instace block and instance block is run just after the static block


public class StaticBlockInstanceBlock {

    public static void main(String[] args) {
        StaticBlockInstanceBlock s = new StaticBlockInstanceBlock();
    }

    // constructor
    StaticBlockInstanceBlock() {
        System.out.println("Constructor run after the instance block");
    }

    // instance block
    {
        System.out.println("Instant block run just after the static block and before constructor");
    }

    // static block
    static {
        System.out.println("static block which run before instance block");
    }
}

 