package com.my.inher;

public class InitMain {
    public static void main(String[] args) {
        SubInit obj = new SubInit("korea", "Seoul", "+81");
        System.out.printf("%s, %s, %s\n", obj.country, obj.city, obj.code);

    }
}
