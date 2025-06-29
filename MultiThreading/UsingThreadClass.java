public class UsingThreadClass {

    public static void main(String[] args) throws Exception {
        A a = new A();
        a.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Vijay Kumar Gupta");
            Thread.sleep(1000);
        }
    }
}

class A extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Vijay Kumar");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

