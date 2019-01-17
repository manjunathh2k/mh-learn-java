package mh.java.threads.simple1;

public class SimpleThread1 {

    public static void main(String[] args)  {

        //new SimpleThread1().threadSample1();
        new SimpleThread1().threadSample2();

    }

    public void threadSample2()
    {
        LongClass lon = new LongClass();

        try {
            Runnable run = () -> {
                for (int i=0;i<1000;i++)
                     lon.updateInt();
            };

            Thread t[] = new Thread[1000];

            for(int i=0;i<1000;i++) {
                t[i] = new Thread(run);
                t[i].start();
                //t[i].join();
            }

            for(int i=0;i<1000;i++)
                t[i].join();

            System.out.println(lon.getL());
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }


    public void threadSample1()
    {

        Runnable run = () -> System.out.println("Into Thread with name:" + Thread.currentThread().getName());

        try {


            Thread t = new Thread(run);
            t.setName("New Thread");

            t.start();
            t.join();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Done ...");

    }
}
