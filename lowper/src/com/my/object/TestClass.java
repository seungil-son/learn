package com.my.object;

class Human
{
    String Name; // 필드 = 멤버 변수 = 속성


}

public class TestClass {
    public static void main(String[] args) {
        Human h = new Human(); // new연산자는 객체를 생성한 후 생성자를 초기화하고 객체의 주소를 리턴

        System.out.println(System.identityHashCode(h)); // 객체가 생성됨을 확인
        System.out.println(h.Name);


    }
}
