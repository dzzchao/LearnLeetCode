package cn.thread;

public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> tl = new ThreadLocal<>();

        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                tl.set("111-222A");
                tl.set("111-222B");
                System.out.println("thread1" + tl.get());
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                tl.set("222");
                System.out.println("thread2" + tl.get());
            }
        };
        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println(tl.get());
    }
}
