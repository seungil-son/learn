package com.my.reference;

public class StringTest {
    public static void main(String[] args) {
        String str = "Hello-Java";

        System.out.println(str);
        System.out.println(str.length()); // 값 : 10, 문자열 길이 반환.

        System.out.println(str.charAt(6)); // 값 : J, index중 6번째 값을 가져옴
        System.out.println(str.replace("H", "h")); // H -> h
        System.out.println(str.substring(0,4)); // 출력 : Hell, 0번부터 3번째 index를 가져옴

        String[] tokens = str.split("-");
        System.out.println(tokens[1]);  // 출력 : Java, "-"기준으로 문자열 구분하여 반환
        System.out.println(tokens[0]);  // 출력 : Hello
    }
}
