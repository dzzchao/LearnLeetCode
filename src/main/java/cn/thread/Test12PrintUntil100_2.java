package cn.thread;

public class Test12PrintUntil100_2 {
    static int count = 1;

    public static void main(String[] args) {
        Object obj = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (obj) {
                        try {
                            if ((count & 1) == 1) {
                                System.out.println(Thread.currentThread().getName() + "---" + count);
                                count++;
                                obj.notify();
                            } else {
                                obj.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "---" + "线程空转");
                }
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 100) {
                    synchronized (obj) {
                        try {
                            if ((count & 1) == 0) {
                                System.out.println(Thread.currentThread().getName() + "---" + count);
                                count++;
                                obj.notify();
                            } else {
                                obj.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "---" + "线程空转");
                }
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
