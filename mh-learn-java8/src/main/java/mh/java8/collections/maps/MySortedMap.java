package mh.java8.collections.maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {

    public static void main(String[] args) {

        SortedMap<String, String> sMap = new TreeMap<>();

        sMap.put("2222","ghi");
        sMap.put("3333","abc");
        sMap.put("1111","def");
        sMap.put("6666","xyz");
        sMap.put("4444","mn0");

        sMap.forEach( (k,v) -> System.out.println(k + " | " + v));
    }
}
