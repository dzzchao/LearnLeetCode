package cn.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//有缺陷会导致线程空转
public class Test123LoopPrintUseLock {

    public static void main(String[] args) {
        AtomicInteger flag = new AtomicInteger();
        ReentrantLock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        Condition c3 = lock.newCondition();

        Thread b1 = new Thread(() -> {
            while (true) {
//                System.out.println(11111111 + "==start");
                try {
                    lock.lock();
                    if (flag.get() == 0) {
                        System.out.println("1");
                        flag.incrementAndGet();
                        c2.signal();
                    } else {
                        c1.await();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
//                System.out.println(11111111 + "==end");
            }
        });
        Thread b2 = new Thread(() -> {
            while (true) {
//                System.out.println(22222222 + "==start");
                try {
                    lock.lock();
                    if (flag.get() == 1) {
                        System.out.println("2");
                        flag.incrementAndGet();
                        c3.signal();
                    } else {
                        c2.await();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
//                System.out.println(22222222 + "==end");
            }
        });
        Thread b3 = new Thread(() -> {
            while (true) {
//                System.out.println(3333333 + "==start");
                try {
                    lock.lock();
                    if (flag.get() == 2) {
                        System.out.println("3");
                        flag.compareAndSet(2, 0);
                        c1.signal();
                    } else {
                        c3.await();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
//                System.out.println(3333333 + "==end");
            }
        });

        b1.start();
        b2.start();
        b3.start();

    }
}
