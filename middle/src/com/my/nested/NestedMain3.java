package com.my.nested;
/*
    로컬클래스 - 메서드안에 정의된 클래스
 */
class AAA{
    void method() {
        int localVal = 10;

        class Local{        // 지역 클래스 : 메서드 안에서만 사용 가능한 클래스
            final int localField = 1;
            static final int localStaticField = 2;

            void localMethod(){
                System.out.printf("localField %d, localVal %d\n", localField, localVal);
                //localVal += 10;   // 로컬변수는 로컬 클래스에서 변경 하면 안된다. 즉 final 특성을 가진다.

            }
            static void localStaticMethod() {
                System.out.printf("localStaticField %d\n", localStaticField);
            }
        }
        Local lo = new Local();
        lo.localMethod();
        Local.localStaticMethod();
    }

}

public class NestedMain3 {
    public static void main(String[] args) {
        AAA a = new AAA();
        a.method();
    }
}
