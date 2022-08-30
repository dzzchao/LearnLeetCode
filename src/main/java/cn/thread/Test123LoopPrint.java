package cn.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Test123LoopPrint {
    public static void main(String[] args) {
        AtomicInteger flag = new AtomicInteger();
        Thread b1 = new Thread(() -> {
            while (true) {
                if (flag.get() == 0) {
                    System.out.println("1");
                    flag.incrementAndGet();
                }
            }
        });
        Thread b2 = new Thread(() -> {
            while (true) {
                if (flag.get() == 1) {
                    System.out.println("2");
                    flag.incrementAndGet();
                }
            }
        });
        Thread b3 = new Thread(() -> {
            while (true) {
                if (flag.get() == 2) {
                    System.out.println("3");
                    flag.getAndSet(0);
                }
            }
        });

        b1.start();
        b2.start();
        b3.start();

    }
}
