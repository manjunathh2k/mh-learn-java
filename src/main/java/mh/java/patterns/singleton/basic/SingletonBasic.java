package mh.java.patterns.singleton.basic;

public class SingletonBasic
{
    private static SingletonBasic instance = new SingletonBasic();

    private SingletonBasic(){}

    public static SingletonBasic getInstance(){
        return instance;
    }

}

