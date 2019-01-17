package mh.java.patterns.singleton.basic;


public class SingletonBasicMain {

    public static void main(String[] args) {
        SingletonBasic firstInstance = SingletonBasic.getInstance();

        System.out.println("First Instance:" + firstInstance);

        SingletonBasic secondInstance = SingletonBasic.getInstance();

        System.out.println("Second Instance:" + secondInstance);

    }

}