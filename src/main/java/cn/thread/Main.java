package cn.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        Setup setup = new Setup();
        setup.main();
    }
}

class Producer implements Runnable {
    private final BlockingQueue queue;

    Producer(BlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (true) {
                queue.put(produce());
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {

        }
    }

    Object produce() {
        int random = new Random().nextInt(100);
        System.out.println("生产" + random);
        return random;
    }
}

class Consumer implements Runnable {
    private final BlockingQueue queue;

    Consumer(BlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (true) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {

        }
    }

    void consume(Object x) {
        System.out.println(Thread.currentThread().getName() + "消费 = " + x);
    }
}

class Setup {
    public void main() {
        BlockingQueue q = new ArrayBlockingQueue(2);
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q);
        Consumer c2 = new Consumer(q);
        new Thread(p).start();
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}