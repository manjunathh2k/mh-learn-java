package mh.java.threads.deadlock;

public class DeadLockThread {

    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a()
    {
        synchronized (key1)
        {
            System.out.println( Thread.currentThread().getName() + " - Into a");
            b();
        }
    }

    public void b()
    {
        synchronized (key2)
        {
            System.out.println( Thread.currentThread().getName() + " - Into b");
            c();
        }
    }

    public void c()
    {
        synchronized (key1)
        {
            System.out.println( Thread.currentThread().getName() + " - Into c");
        }
    }


}
