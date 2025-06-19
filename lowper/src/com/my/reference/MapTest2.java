package com.my.reference;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
/*
    LinkedMap : 입력 순서 유지
                최신정보를 확인할때 등등사용
                null 허용
    */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("b", "banana");
        linkedMap.put("a", "apple");
        linkedMap.put("c", "cherry");

        System.out.println(linkedMap); //입력 순서 유지
        linkedMap.put(null, "no");
        System.out.println(linkedMap); //null 허용

    }
}
