package cn.thread;

import java.util.concurrent.atomic.AtomicInteger;

//会有问题，不知道为啥会有问题
public class Test123LoopPrintNoAtomic {
    static int flag = 0;

    public static void main(String[] args) {
        Thread b1 = new Thread(() -> {
            while (true) {
                if (flag == 0) {
                    System.out.println("1");
                    flag++;
                }
            }
        });
        Thread b2 = new Thread(() -> {
            while (true) {
                if (flag == 1) {
                    System.out.println("2");
                    flag++;
                }
            }
        });
        Thread b3 = new Thread(() -> {
            while (true) {
                if (flag == 2) {
                    System.out.println("3");
                    flag = 0;
                }
            }
        });
        b1.start();
        b2.start();
        b3.start();
    }
}
