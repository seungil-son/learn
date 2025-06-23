package com.my.anony;

/* 익명개체
    이름 없음 → 재사용 불가, 일회성

    짧고 간결함 → 코드 길이를 줄이기 좋음

    한 번만 쓰고 버릴 객체 생성에 유용

    추상 클래스나 인터페이스 구현할 때 자주 사용
*/

class AAA{
    public void instanceMethod(){
        System.out.println("instanceMethod()");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        AAA a = new AAA(){
            @Override
            public void instanceMethod(){
                System.out.println("InstanceMethod Ovrride");
                super.instanceMethod(); // 부모의 instanceMethod호출
            }
        };
        a.instanceMethod();
        System.out.println(a.toString());
    }

}
