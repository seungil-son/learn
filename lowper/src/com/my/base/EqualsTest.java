package com.my.base;

public class EqualsTest {
    public static void main(String[] args) {
    test1(); //test1 함수 호출
    test2(); //test2 함수 호출
    test3();
    }
    static void test1(){
        // void = 함수의 출력
        // () = 함수의 입력
        // 입력이 없으니 출력이 없어서 return값이 없다.
        Object obj1 = new Object();
        Object obj2 = obj1;  //객체 복사

        boolean result = obj1.equals(obj2);
        System.out.println(result); //true


        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());//동일한 해쉬태그

        boolean result2 = (obj1 == obj2);

        System.out.println(result2); //ture

    }
    static void test2() {
        String str = "홍길동";
        String str2 = "홍길동";

        System.out.println();

        System.out.println(str.equals(str2)); //true

        System.out.println(str == str2); //ture
    }
    static void test3()
    {
        String str = new String("홍길동");
        String str2 = new String("홍길동");

        System.out.println();
        System.out.println(str.equals(str2)); //true equals는 값을 비교한다

        System.out.println(str == str2); //false ==는 주소를 비교한다.

    }

}
