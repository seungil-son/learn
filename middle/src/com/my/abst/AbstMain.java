package com.my.abst;

/*
    추상(abstract) 메서드는 몸체 부분이 없는 메서드로 abstract 키워드를 붙인다.
    재정의(Override)될 것을 약속한 클래스이다.
    이런 메서드를 하나라도 가진 클래스를 추상 클래스라 한다.
    추상 메서드는 객체를 생성할 수 없다.
*/
/*
    #메서드의 정의
    int func()     // 함수의 머리(출력 함수이름 입력)
    {              // 함수의 몸통
        return 0;
    }
*/
abstract class AbsClass { // 추상(abstract) 클래스
    void method() {

    }
    public abstract void absMethod();  // 추상(abstract) 메서드 (실행부가 없다)
}
class AAA extends AbsClass{
    @Override  // 재정의
    void method() {
        System.out.println("Method 재정의");
    }
    @Override
    public void absMethod() {
        System.out.println("추상(abstract) Method 재정의");
    }


}

public class AbstMain {
    public static void main(String[] args) {
        AbsClass absClass = new AAA();
        absClass.method();
        absClass.absMethod();

        // AbsClass obj= new AbsClass();  // 객체 생성 불가
    }
}
