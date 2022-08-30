package cn.thread;

public class Test123print {

   static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(1);
        }
    });
   static Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(2);
        }
    });

   static Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(3);
        }
    });

    public static void main(String[] args) {
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
