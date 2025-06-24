package com.my.lambda;

/*
    람다식 : - 함수를 하나의 식으로 나타낸 것(익명함수 = 람다식 = 람다함수)
            - Java에서 코드를 더 간결하고 유연하게 만들어주는 익명 함수 표현식
            - 이름 없이 한 번만 쓰고 싶은 메서드를 짧고 예쁘게 표현
            - 추상 메서드가 하나인 함수형 인터페이스만 람다식으로 사용 가능
 */

interface MyFunction {
    int calc(int x, int y);     // 추상 메서드
}
/* 람다식은 함수형 인터페이스를 구현한 객체이다. */
public class LambdaTest {
    public static void main(String[] args) {
        // (입력) -> {몸통}
        MyFunction add = (int x, int y) -> {return  x + y;};        // 함수형 인터페이스를 구현한 객체 람다식
        MyFunction minus = (int x, int y) -> x - y;                 // {}안의 부분이 1줄이내 일때 return생략가능

        System.out.println(add.calc(10,20));
        System.out.println(minus.calc(10,20));
    }

}
