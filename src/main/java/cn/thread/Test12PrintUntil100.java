package cn.thread;

/**
 * @deprecated 线程空转
 */
public class Test12PrintUntil100 {
    static int tag = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (tag < 100) {
                    synchronized (this) {
                        if ((tag & 1) == 1) {
                            System.out.println(Thread.currentThread().getName() + "  " + tag);
                            tag++;
                        }
                    }
                    System.out.println("线程空转");
                }
            }
        }, "tt1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (tag <= 100) {
                    synchronized (this) {
                        if ((tag & 1) == 0) {
                            System.out.println(Thread.currentThread().getName() + "  " + tag);
//                            tag++;
                        }
                    }
                    System.out.println("线程空转");
                }
            }
        }, "tt2");
        t1.start();
        Thread.sleep(100);
        t2.start();
    }
}
