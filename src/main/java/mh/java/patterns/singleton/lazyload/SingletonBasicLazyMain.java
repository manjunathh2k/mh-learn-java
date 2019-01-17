package mh.java.patterns.singleton.lazyload;


public class SingletonBasicLazyMain {

    public static void main(String[] args) {
        SingletonBasicLazy firstInstance = SingletonBasicLazy.getInstance();

        System.out.println("First Instance:" + firstInstance);

        SingletonBasicLazy secondInstance = SingletonBasicLazy.getInstance();

        System.out.println("Second Instance:" + secondInstance);

    }

}