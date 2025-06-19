package com.my.reference;

import java.util.HashMap;
import java.util.Map;
/*
 Map : Key와 Value가 쌍으로 이루어진 자료구조
       중복을 허락하지 않는다.
       대표적인 구현 클래스 HashMap, LinkedMap, TwinMap이 있다.
       HashMap은 해시테이블을 사용하여 순서를 보장하지 않는다.
       null허용
       사용자 로그인(ID, Password)에 사용됨
* */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Jane", 28);

        System.out.println(ageMap);
        System.out.printf("Bob의 나이 : ");
        System.out.println(ageMap.get("Bob"));

        ageMap.remove("Jane");  // 키값 "Jane"으로  삭제

        System.out.println(ageMap);
        System.out.println(ageMap.containsKey("Jane")); // "Jane"을 삭제해서 false출력

        ageMap.put(null, 0);  //null키 허용
        System.out.println(ageMap);

        ageMap.put("Jane", 28);
        System.out.println(ageMap);
        ageMap.put("Jane", 28);
        System.out.println(ageMap); //중복키 허용x


    }
}
