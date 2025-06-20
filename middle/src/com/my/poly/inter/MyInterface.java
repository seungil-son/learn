package com.my.poly.inter;
/*
    인터페이스
    상속을 interface로 한다
    추상메서드, 상수 필드, 디폴트메서드, 정적메서드, 메서드를 선언할 수 있다.
    이 멤버는 모드 public 접근 제한으로 구현하는데 생략 가능하다.
    private 선언도 가능하다.
    객체를 생성할 수 없다.

 */
public interface MyInterface {
    // 상수필드 (public static final로 생성)
    public static final int MAX_COUNT = 100;

    // 추상 메서드
    void Method();

    // default 메서드 - 완벽한 메서드
    default void defaultMethod(){
        System.out.println("dafaultMethod 호출");
        privateMethod();
        System.out.println("--------");
    }

    // 정적 메서드 - 구현객체 없이도 호출가능
    static  void staticMethod(){
        System.out.println("StaticMethod 호출");
        System.out.println("--------");
    }

    // Private 메서드  -> defaultMethod안에서 호출해야한다.
    private void privateMethod(){
        System.out.println("privateMethod 호출");
    }
}

class MyClass implements MyInterface{
    @Override
    public void Method(){
        System.out.println("abstractMethod 호출");
        System.out.println("--------");
    }
}