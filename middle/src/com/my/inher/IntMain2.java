package com.my.inher;

public class IntMain2 {
    public static void main(String[] args) {
        SubInit2 obj = new SubInit2("Korea", "Seoul", "+82");

        System.out.printf("%s %s %s\n",obj.country, obj.city, obj.code);
    }
}
