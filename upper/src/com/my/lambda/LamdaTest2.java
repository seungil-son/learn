package com.my.lambda;


/* 매개변수가 없는 람다식 */
interface MyFunction2{
    void print();
}

public class LamdaTest2 {
    public static void main(String[] args) {
        MyFunction2 fn = () -> {
            System.out.println("Hello");
        };

        fn.print();

        fn = () -> System.out.println("안녕하세요");         // 한 문장인 경우는 중괄호 생략가능


        fn.print();
    }
}

