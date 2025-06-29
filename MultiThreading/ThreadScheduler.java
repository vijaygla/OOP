public class ThreadScheduler {
    public static void main(String[] args) {
        A t1 = new A(); // thread 1 = t1
        A t2 = new A(); // thread 2 = t2
        A t3 = new A(); // thread 3 = t3

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class A extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }
    }
}

 