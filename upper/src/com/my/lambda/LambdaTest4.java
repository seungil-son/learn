package com.my.lambda;

/* 제네릭(Generic)을 사용한 람다식 */

interface  MyFunction4<T>{
    void print(T x);
}

public class LambdaTest4 {
    public static void main(String[] args) {
        MyFunction4<String> f1 = x -> System.out.println(x);
        f1.print("ABC");

        MyFunction4<Integer> f2 = x -> System.out.println(x);
        f2.print(100);
        f2.print(Integer.valueOf("100"));               // valueOf는 Interger
        f2.print(Integer.parseInt("200"));              // parseInt는 int

    }
}
