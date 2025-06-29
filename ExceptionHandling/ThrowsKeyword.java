public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        // use throws keyword when we dont want to handle the exception by self in this case JVM handle the exception
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

