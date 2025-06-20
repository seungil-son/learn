package com.my.poly.inter;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterface my = new MyClass();
        my.Method();
        my.defaultMethod();
        System.out.println(MyInterface.MAX_COUNT);
        System.out.println();
        MyInterface.staticMethod();


    }
}
/*
    출력

    abstractMethod 호출
    --------
    dafaultMethod 호출
    privateMethod 호출
    --------
    100

    StaticMethod 호출
    --------
 */
