package com.my.reference;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple");

        System.out.println(set);
    }
}
