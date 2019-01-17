package mh.java8.collections.maps;

import java.util.*;

public class MyMaps {
    public static void main(String[] args) {
        Map <String,String> map = new HashMap<String,String>();

        map.put("222","ghi");
        map.put("111","abc");
        map.put("333","def");

        map.forEach((k,v) -> System.out.println(k + " | " + v));

        map.replaceAll((k,v) -> v.toUpperCase());

        map.forEach((k,v) -> System.out.println(k + " | " + v));
    }
}
