package com.my.reference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
    public static void main(String[] args) {
       String[] names = {"Alice", "Bob", "Alice", "Jane"};
       Set<String> uniqueNames = new HashSet<>(Arrays.asList(names));
        System.out.println(uniqueNames); // 중복이 출력안됨

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(5);
        System.out.println(numbers); //중복이 출력안되고 정렬되어 출력
    }
}
