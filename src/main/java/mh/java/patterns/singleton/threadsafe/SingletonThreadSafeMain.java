package mh.java.patterns.singleton.threadsafe;


public class SingletonThreadSafeMain {

    public static void main(String[] args) {
        SingletonThreadSafe firstInstance = SingletonThreadSafe.getInstance();

        System.out.println("First Instance:" + firstInstance);

        SingletonThreadSafe secondInstance = SingletonThreadSafe.getInstance();

        System.out.println("Second Instance:" + secondInstance);

    }

}