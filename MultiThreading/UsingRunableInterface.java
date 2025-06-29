public class UsingRunableInterface {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();

        for(int i=1; i<=5; i++) {
            System.out.println("My main thread");
        }
    }
}


class A implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("My child thread made using runable interface");
        }
    }
}

