package com.my.reference;

import java.util.Map;
import java.util.TreeMap;
/*
 TreeMap : 오름차순 정렬, 속도가 느림, null 불허
* */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("b", "banana");
        treeMap.put("a", "apple");
        treeMap.put("c", "cherry");

        System.out.println(treeMap);
        treeMap.put(null, "NO");
        System.out.println(treeMap);

    }
}
