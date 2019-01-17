package mh.java.patterns.singleton.lazyload;

public class SingletonBasicLazy
{
    private static SingletonBasicLazy instance = null;

    private SingletonBasicLazy(){}

    public static SingletonBasicLazy getInstance(){

        if(instance == null)
        {
            instance = new SingletonBasicLazy();
        }
        return instance;
    }

}

