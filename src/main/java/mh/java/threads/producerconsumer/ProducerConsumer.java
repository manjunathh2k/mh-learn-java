package mh.java.threads.producerconsumer;

public class ProducerConsumer {

    private static Object lock = new Object();
    private static int[] buffer;
    private static int count;

    static class Producer{
        void produce(){
            synchronized (lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                lock.notify();
            }
        }
    }

    static class Consumer{
        void consume(){
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try{
                    lock.wait();
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                buffer[--count] = 0;
                lock.notify();
            }
        }
    }

    static boolean isEmpty(int[] _buffer)
    {
        return count == 0;
    }

    static  boolean isFull(int[] _buffer)
    {
        return count == _buffer.length;
    }

    public static void main(String[] args) throws InterruptedException {

        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable runConsumer = () -> {
            for(int i=0; i < 50; i++)
                consumer.consume();

            System.out.println("Done with Consuming");
        };

        Runnable runProducer = () -> {
            for(int i=0;i<50;i++)
                producer.produce();

            System.out.println("done with producing");
        };

        Thread t1 = new Thread(runConsumer);
        Thread t2 = new Thread(runProducer);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Value of count:" + count);

    }
}
