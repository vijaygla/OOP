// use of throw keyword in such case when you want to throw you own creating exception created by you

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println(15 / 0);

        throw new ArithmeticException("We can divide any number by zero incorrect logic");
    }
}


