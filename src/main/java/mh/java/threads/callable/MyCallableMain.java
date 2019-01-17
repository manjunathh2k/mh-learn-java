package mh.java.threads.callable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.*;

public class MyCallableMain implements Callable<Integer> {

    private String filetoprocess=null;

    public MyCallableMain(String _fileName)
    {
        filetoprocess = _fileName;
    }

    public static void main(String[] args) {
        String[] fileNames = {"File1.txt","File2.txt"};

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer>[] result = new Future[fileNames.length];
        for(int i=0;i<fileNames.length;i++)
        {
           result[i] = es.submit(new MyCallableMain(fileNames[i]));
        }

        try{
            es.shutdown();
            es.awaitTermination(60,TimeUnit.MINUTES);

            for(Future<Integer> r:result)
            {
                int value = r.get();
                System.out.println(value);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public Integer call(){
        int cnt =0;
        String line = null;

        try( BufferedReader br = new BufferedReader( new InputStreamReader( this.getClass().getResourceAsStream(filetoprocess))))
       {
           while((line =  br.readLine()) != null)
            {
                System.out.println(line);
                cnt = cnt + Integer.valueOf(line);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return cnt;
    }
}
