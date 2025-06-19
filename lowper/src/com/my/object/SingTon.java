package com.my.object;
/*
    SingleTon : 애플리케이션 전체에 오직 하나의 인스턴스만 존재하는 디자인 패턴이다.
                주로 전역상태 관리나 공유자원에 대한 접근을 제어할 때 사용한다.
*/

public class SingTon {
    // private static 로 셀프 인스턴스를 생성하여 인스턴스를 리턴시킨다.
    private static final SingTon instance = new SingTon();
    // 생성자는 외부에서 객체생성을 차단하게 private로 선언한다.
    private SingTon(){}
    // 인스턴스를 반환하는 메서드
    public static SingTon getInstance() {
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello from SingleTon!! ");
    }

}
