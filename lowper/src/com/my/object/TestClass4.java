package com.my.object;


/* 메소드
*     메소드는 객체별로 할당하지 않고 메서드 영역에 위치한 메서드를 공유한다.
      JVM 메모리영역 : 1.메소드 영역(메소드, 상수, static 변수등 저장), 2. 힙 영역(객체 저장), 3.스택 영역(지역 변수, 매개변수)

 */
class MethodClass{
    void showMethod() {
        System.out.println("showMethod!! ");
    }
}

public class TestClass4 {
    public static void main(String[] args) {
        MethodClass obj = new MethodClass();
        obj.showMethod();  // obj 객체는 showMethod를 읽어들인다.

        MethodClass obj2 = new MethodClass();
        obj2.showMethod(); // obj2 객체는 showMethod를 읽어들인다.

    }
}
