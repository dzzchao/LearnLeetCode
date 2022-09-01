package cn.thread;

public class TestAlternatePrinting {
    int count = 0;
    final Object obj = new Object();

    public static void main(String[] args) {
        new TestAlternatePrinting().print();
    }

    void print() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //奇数 -odd
                while (count <= 100) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + " " + count);
                        count++;
                        obj.notify();
                        try {
                            if(count <=100) {
                                obj.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //偶数 even
                while (count <= 100) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + " " + count);
                        count++;
                        obj.notify();
                        try {
                            if(count <=100) {
                                obj.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
