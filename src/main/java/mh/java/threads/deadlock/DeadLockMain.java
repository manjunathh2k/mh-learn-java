package mh.java.threads.deadlock;

public class DeadLockMain {
    public static void main(String[] args) throws InterruptedException {

        DeadLockThread a = new DeadLockThread();
        Runnable run1 = () -> a.a();
        Runnable run2 = () -> a.b();

        Thread t1 = new Thread(run1);
        t1.start();

        Thread t2 = new Thread(run2);
        t2.start();

        t1.join();
        t2.join();

    }
}
