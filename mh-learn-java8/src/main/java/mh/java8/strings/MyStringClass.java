package mh.java8.strings;

import java.util.StringJoiner;

public class MyStringClass {

    public static void main(String[] args) {
       // new MyStringClass().stringJoiner1();
        new MyStringClass().stringFormater();

    }

    private void stringJoiner1(){

        StringJoiner sj = new StringJoiner(", ","{ "," }");

        sj.add("Alpha").add("Gama").add("Beta");

        System.out.println("Value of StringJoiner:" + sj.toString());
    }

    private void stringFormater(){
        String s1,s2;

        s1 = String.format("W:%4d X:%4d", 5, 235);
        s2 = String.format("Y:%4d Y:%4d", 8, 765);

        System.out.println(s1 + "\n" + s2);

        s1 = String.format("W:%04d X:%04d", 5, 235);
        s2 = String.format("Y:%04d Y:%04d", 8, 765);

        System.out.println(s1 + "\n" + s2);

        s1 = String.format("W:%-4d X:%-4d", 5, 235);
        s2 = String.format("Y:%-4d Y:%-4d", 8, 765);

        System.out.println(s1 + "\n" + s2);

        System.out.println(String.format("%,d", 12345678));

        System.out.println(String.format("%+d\n%+d\n% (d\n% (d",123,-456,123,-456));
    }
}
