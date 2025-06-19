package com.my.object;

/*
*   생성자 오버로딩(다중정의)
*      이름이 같고 매개변수의 타입, 갯수, 순서가 다르면 다중정의가 가능하다.
*
* */
class Persons {
    String name;
    int age;

    Persons(){} //디폴트 생성자
    Persons(String name){
        this.name = name;
    }
    Persons(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ConstructTest {
    public static void main(String[] args) {
        Persons p = new Persons();
        System.out.println(p.name+ " "+ p.age); // null
        Persons p1 = new Persons("홍길동");
        System.out.println(p1.name+" "+ p1.age);  // 홍길동 0

        Persons p2 = new Persons("강감찬", 800);
        System.out.println(p2.name + " " + p2.age);
    }
}
