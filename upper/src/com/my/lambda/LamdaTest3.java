package com.my.lambda;


/* 인수로 사용한 람다식 */

interface MyFunction3{
    int calc(int x , int y);
}

public class LamdaTest3 {
    public static void main(String[] args) {
        printCalc(10,200,(x,y)-> x * y);                  // 람다식을 인수로 전달한다.
    }

    static void printCalc(int x, int y, MyFunction3 function3){        // 인터페이스 매개변수
        System.out.println(function3.calc(x, y));

    }
}
