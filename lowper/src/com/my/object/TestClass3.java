package com.my.object;

/* 필드
    생성자는 초기화 가능
    클래스는 컴파일을 통해서 바이트코드로 변환(클래스 파일)되고,
    JVM은 클래스 로더를 통해서 클래스 파일을 읽어드리고,
    클래스 파일의 내용을 메모리에 로더한다.
    그러므로 클래스 필드의 초기화가 가능하다

 * */
class FieldClass{ // 라이브러리 클래스
    String str = "MyClass";
}

public class TestClass3 {  // 실행 클래스
    public static void main(String[] args) {
        FieldClass obj = new FieldClass();

        System.out.println(obj.str);

    }
}
