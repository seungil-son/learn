package com.my.nested;

/*
    내부 클래스 에서는 외부 클래스의 모든 멤버를 사용할 수 있다.
 */

class Outer{
    class Inner{
        int innerField = 11;
        static int innerStaticField = 22;       // 내부 정적 멤버

        void innerMethod(){
            System.out.printf("innerField %d\n", innerField);
        }
        static void InnerStaticMethod() {       // 내부 정적 메소드
            System.out.printf("innerStaticField %d \n", innerStaticField);
        }
        void innerToOuter(){                    // 내부 클래스에서 외부 클래스 멤버 접근
            OuterField = 100;
            outsStaticField = 200;
            OuterMethod();
            outerStaticMethod();
        }
    }
    int OuterField = 1;
    static int outsStaticField = 2;
    void OuterMethod(){
        System.out.printf("OuterField %d \n", OuterField);
    }
    static void outerStaticMethod(){
        System.out.printf("outerStaticField %d\n", outsStaticField);
    }
}
public class NestedMain2 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.OuterMethod();
        Outer.outerStaticMethod();

        Outer.Inner in = new Outer().new Inner();
        in.innerMethod();
        in.innerToOuter();

        Outer.outerStaticMethod();
        Outer.Inner.InnerStaticMethod();        // 내부클래스의 static멤버 접근



    }
}
/*
        출력
    OuterField 1
    outerStaticField 2

    innerField 11
    OuterField 100
    outerStaticField 200

    outerStaticField 200
    innerStaticField 22
 */
