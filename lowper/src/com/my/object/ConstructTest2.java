package com.my.object;

/*
    생성자 오버로딩
    this()는 반드시 생성자 첫줄에 위치한다.
    현재 클래스의 다른 생성자를 호출한다.
    중복코드를 제거하고 생성자간의 재사용을 가능하게 한다.
 */

class Personss {
    String name;
    int age;

    Personss(){
        this("unknown", 0);  // 입력값이 2개인 다른 생성자를 호출
        System.out.println("디폴트 생성자 호출");
    }
    Personss(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("매개변수 2개의 생성자 호출");
    }
}
public class ConstructTest2 {
    public static void main(String[] args) {
        Personss obj = new Personss();
        Personss obj2 = new Personss("홍길동",2025);

    }
}
