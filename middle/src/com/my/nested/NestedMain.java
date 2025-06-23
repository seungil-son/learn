package com.my.nested;

//       중복
/*  인스턴스 멤버 클래스
    외부클래스에서 내부 클래스에 접근할 수 있다.
 */
class A {
    class B{        // 인스턴스 멤버
        B(){
            System.out.println("B() 생성자 호출");
        }
        public void methodB(){
            System.out.println("Hello from methodB");
        }
    }

    //필드 2개
    int field;
    B fieldB = new B();   // 필드에서 내부 객체 사용

    A(){
        System.out.println("A() 생성자 호출 ");
        B b = new B();      // 외부 생성자에서 내부 객체 사용가능
        b.methodB();
    }
    void methodA(){
        System.out.println("------------------");
        System.out.println("methodA() 함수 호출");
        B b = new B();      // 외부 메서드에서 내부 객체 사용가능
        b.methodB();;
    }


}
public class NestedMain {
    public static void main(String[] args) {
        A a = new A();    // 외부 클래스 A의 인스턴스 생성 : 필드초기화로 B() 호출된다.
                          // B() -> A() ->B()
        a.methodA();

        // 내부 클래스의 객체 생성 방법
        A.B b = new A().new B(); // A클래스 내부의 B클래스 사용
        b.methodB();
    }
}
/*
    전체출력
    // 함수의 A a = new A();의 출력
    B() 생성자 호출          // class A내부의 필드 B fieldB = new B();의 출력
                           // 생성과 동시에 클래스 내부의 필드를 초기화함
    A() 생성자 호출
    B() 생성자 호출
    Hello from methodB
    ------------------
    // a.methodA();의 출력
    methodA() 함수 호출
    B() 생성자 호출
    Hello from methodB
 */
